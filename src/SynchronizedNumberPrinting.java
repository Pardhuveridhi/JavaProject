package src;

class NumberPrinter {
    private int number = 1;
    private final int limit = 10;

    public synchronized void printNumbers() {
        while (number <= limit) {
            System.out.println(Thread.currentThread().getName() + ": " + number);
            number++;
            try {
                Thread.sleep(500); // Adding a small delay for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedNumberPrinting {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread thread1 = new Thread(printer::printNumbers, "Thread-1");
        Thread thread2 = new Thread(printer::printNumbers, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
