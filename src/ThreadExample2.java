package src;

public class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(Thread.currentThread().getName() + " - Letter: " + c);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample2());
        Thread thread2 = new Thread(new ThreadExample2());
        Thread thread3 = new Thread(new ThreadExample2());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
