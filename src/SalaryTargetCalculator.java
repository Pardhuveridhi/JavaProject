package src;

import java.util.Scanner;

public class SalaryTargetCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter your current age: ");
        int currentAge = scanner.nextInt();

        System.out.print("Enter your current monthly gross salary: ");
        double currentSalary = scanner.nextDouble();

        System.out.print("Enter the expected annual hike percentage (e.g., 10 for 10%): ");
        double hikePercentage = scanner.nextDouble();

        System.out.print("Enter the target monthly gross salary: ");
        double targetSalary = scanner.nextDouble();

        // Convert percentage to decimal
        double hikeRate = hikePercentage / 100;

        int years = 0;

        // Calculate years required to reach or exceed target salary
        while (currentSalary < targetSalary) {
            currentSalary += currentSalary * hikeRate;
            years++;
        }

        // Calculate the age at which target salary is achieved
        int targetAge = currentAge + years;

        // Output the result
        System.out.println("You will earn a gross salary of " + targetSalary + " or more at the age of " + targetAge + ".");

        scanner.close();
    }
}
