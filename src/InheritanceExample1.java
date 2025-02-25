package src;

class Animal {
    Animal() {
        System.out.println("Animal's Constructor Called");
    }
    int age = 5;
}

class Mammal extends Animal {
    Mammal() {
        System.out.println("Mammal's Constructor Called");
    }
    int weight = 10;
}

class Dog extends Mammal {
    Dog() {
        System.out.println("Dog's Constructor Called");
    }
    int height = 20;
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Mammal mammal = new Mammal();
        Mammal m1 = new Dog();
        Animal a1 = new Mammal();
        Animal a2 = new Dog();
        System.out.println("Value of age = " + dog.age);
        System.out.println("Value of weight = " + dog.weight);
        System.out.println("Value of height = " + dog.height);
    }
}
