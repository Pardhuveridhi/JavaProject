package src;

import java.util.ArrayList;
import java.util.List;

// Employee class representing an employee with a name
class Employee_new {
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Override toString() for better readability when printing objects
    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

// Utility class containing the main method
public class Util {
    public static void main(String[] args) {
        // Create a list of Employee objects
        Employee_new e1= new Employee_new();
        Employee_new e2= new Employee_new();
        Employee_new e3= new Employee_new();
        List<Employee_new> employees = new ArrayList<>();
        e1.setName("Sanjay1");
        employees.add(e1);
        e2.setName("Sanjay2");
        employees.add(e2);
        e3.setName("Sanjay3");
        employees.add(e3);

        // Filter employees whose name is "Pune" using Streams
        List<Employee_new> filteredEmployees = employees.stream()
                .filter(emp -> emp.getName().equals("Pune"))
                .toList();

        // Print the number of employees with the name "Pune"
        System.out.println("Number of employees with name 'Pune': " + filteredEmployees.size());

        // Print the filtered employees list
        System.out.println("Filtered Employees: " + filteredEmployees);

        // Iterate through the original list and print the employee named "Sanjay"
        for (Employee_new emp : employees) {
                System.out.println("Employee found: " + emp.getName());
        }
    }
}
