package src;

class TicketCounter {
    private int availableTickets = 10;

    public synchronized void bookTicket(String passengerName, int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            System.out.println(passengerName + " booked " + numberOfTickets + " ticket(s).");
            availableTickets -= numberOfTickets;
            System.out.println("Tickets left: " + availableTickets);
        } else {
            System.out.println(passengerName + " requested " + numberOfTickets + " ticket(s), but only " + availableTickets + " are available.");
        }
    }
}

class PassengerThread extends Thread {
    private TicketCounter ticketCounter;
    private String passengerName;
    private int ticketsToBook;

    public PassengerThread(TicketCounter ticketCounter, String passengerName, int ticketsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.ticketsToBook = ticketsToBook;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(passengerName, ticketsToBook);
    }
}

public class TicketBookingExample {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();

        PassengerThread passenger1 = new PassengerThread(ticketCounter, "Alice", 4);
        PassengerThread passenger2 = new PassengerThread(ticketCounter, "Bob", 7);
        PassengerThread passenger3 = new PassengerThread(ticketCounter, "Charlie", 3);

        passenger1.start();
        passenger2.start();
        passenger3.start();
    }
}
