package src;

class Counter {
    private int count = 0;

    public synchronized void incrementCounter() {
        count++;
        System.out.println("Counter: " + count);
    }
}

class MyThread1 extends Thread {
    private Counter counter;

    public MyThread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.incrementCounter();
            try {
                Thread.sleep(100);  // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating two threads that share the same Counter object
        MyThread1 thread1 = new MyThread1(counter);
        MyThread1 thread2 = new MyThread1(counter);

        // Starting the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("Both threads have finished execution");
    }
}
