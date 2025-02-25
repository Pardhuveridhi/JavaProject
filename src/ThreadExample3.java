package src;

public class ThreadExample3 implements Runnable {
    private String word;

    public ThreadExample3(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        StringBuilder reversed = new StringBuilder(word).reverse();
        System.out.println(Thread.currentThread().getName() + " - Reversed Word: " + reversed);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample3("Hello"));
        Thread thread2 = new Thread(new ThreadExample3("World"));
        Thread thread3 = new Thread(new ThreadExample3("Java"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
