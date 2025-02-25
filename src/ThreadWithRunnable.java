package src;

public class ThreadWithRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread State: " + Thread.currentThread().getState());
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread Name [ " + Thread.currentThread().getName() + " ] Value [ " + i + " ]");
        }
    }

    public static void main(String[] args) {
        ThreadWithRunnable runnableTask1 = new ThreadWithRunnable();
        ThreadWithRunnable runnableTask2 = new ThreadWithRunnable();
        ThreadWithRunnable runnableTask3 = new ThreadWithRunnable();

        Thread thread1 = new Thread(runnableTask1);
        Thread thread2 = new Thread(runnableTask2);
        Thread thread3 = new Thread(runnableTask3);

        System.out.println("Main Thread Name: " + Thread.currentThread().getName());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
