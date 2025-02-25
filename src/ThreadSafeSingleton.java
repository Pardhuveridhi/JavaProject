package src;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance1;
    private static ThreadSafeSingleton instance2;

    static {
        System.out.println("Static block executed.");
        instance1 = new ThreadSafeSingleton();
    }

    {
        System.out.println("Non-static block executed for " + this);
    }

    private ThreadSafeSingleton() {
        System.out.println("Private Constructor executed.");
    }

    public static ThreadSafeSingleton getInstance() {
        if(instance1==instance2) {
            return instance2;
        }
        else {
        return instance1;
         }
        }

    public void performAction() {
        System.out.println("Performing action with Singleton instance.");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
        singleton1.performAction();

        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("Are instances the same? " + (singleton1 == singleton2));
    }
}
