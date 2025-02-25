package src;

class Person1 {
    String name;
    void walk() {
        System.out.println(name + " is walking.");
    }
}

class Employee1 extends Person1 {
    int employeeId;
    void work() {
        System.out.println(name + " is working with ID: " + employeeId);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.name = "Alice";
        emp.employeeId = 123;
        emp.walk();
        emp.work();
    }
}
