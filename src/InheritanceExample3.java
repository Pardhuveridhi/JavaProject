package src;

class Person {
    Person() {
        System.out.println("Person's Constructor Called");
    }
    String name = "John";
}

class Employee extends Person {
    Employee() {
        System.out.println("Employee's Constructor Called");
    }
    String position = "Developer";
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager's Constructor Called");
    }
    int teamSize = 5;
}

public class InheritanceExample3 {
    public static void main(String[] args) {
        Person person = new Person();
        Manager manager = new Manager();
        Employee employee = new Employee();
        Employee e1 = new Manager();
        Person p1 = new Employee();
        Person p2 = new Manager();
        System.out.println("Value of name = " + manager.name);
        System.out.println("Value of position = " + manager.position);
        System.out.println("Value of teamSize = " + manager.teamSize);
    }
}
