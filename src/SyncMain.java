package src;

class SharedResource {
    synchronized void printMessage() {
        System.out.println("Waiting for notification...");
        try { wait(); } catch (Exception e) { }
        System.out.println("Received notification!");
    }
    
    synchronized void sendMessage() {
        System.out.println("Sending notification...");
        notify();
    }
}

public class SyncMain {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        
        new Thread(() -> obj.printMessage()).start();
        try { Thread.sleep(2000); } catch (Exception e) { }
        new Thread(() -> obj.sendMessage()).start();
    }
}
