package src;

public class ThreadExample5 implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(Thread.currentThread().getName() + " - Even Number: " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample5());
        Thread thread2 = new Thread(new ThreadExample5());
        Thread thread3 = new Thread(new ThreadExample5());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
