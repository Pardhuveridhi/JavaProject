package src;

interface Vehicle1 {
    void start();
    void stop();
}

class Car1 implements Vehicle1 {
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle1 myCar = new Car1();
        myCar.start();
        myCar.stop();
    }
}
