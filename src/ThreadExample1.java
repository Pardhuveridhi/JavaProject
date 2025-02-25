package src;

public class ThreadExample1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample1());
        Thread thread2 = new Thread(new ThreadExample1());
        Thread thread3 = new Thread(new ThreadExample1());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
