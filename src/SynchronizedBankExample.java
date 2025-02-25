package src;

class BankAccount {
    private double balance = 0.0;

    // Synchronized method to ensure thread safety during deposits
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Current Balance: " + balance);
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {  // Simulate multiple deposits
            account.deposit(amount);
            try {
                Thread.sleep(100);  // Simulating some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedBankExample {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        // Creating two threads that share the same BankAccount object
        DepositThread thread1 = new DepositThread(account, 100);
        DepositThread thread2 = new DepositThread(account, 200);

        // Starting the threads
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}
