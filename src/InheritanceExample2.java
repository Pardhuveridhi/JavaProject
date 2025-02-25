package src;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle's Constructor Called");
    }
    int speed = 60;
}

class Car extends Vehicle {
    Car() {
        System.out.println("Car's Constructor Called");
    }
    int doors = 4;
}

class SportsCar extends Car {
    SportsCar() {
        System.out.println("SportsCar's Constructor Called");
    }
    int horsepower = 500;
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        SportsCar sportsCar = new SportsCar();
        Car car = new Car();
        Car c1 = new SportsCar();
        Vehicle v1 = new Car();
        Vehicle v2 = new SportsCar();
        System.out.println("Value of speed = " + sportsCar.speed);
        System.out.println("Value of doors = " + sportsCar.doors);
        System.out.println("Value of horsepower = " + sportsCar.horsepower);
    }
}
