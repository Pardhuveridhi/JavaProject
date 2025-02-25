package src;

abstract class Animal1 {
    abstract void makeSound();
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog1 extends Animal1 {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal1 myDog = new Dog1();
        myDog.makeSound();
        myDog.eat();
    }
}
