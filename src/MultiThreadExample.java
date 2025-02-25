package src;

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Thread 1: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Thread 2: " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        
        t1.start();  // Start Thread 1
        t2.start();  // Start Thread 2
    }
}
