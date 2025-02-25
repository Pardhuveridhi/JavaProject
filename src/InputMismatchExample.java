package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Caught an InputMismatchException: " + e.getMessage());
        }
        int x=10;
        int y=23923;
        System.out.println("Add: "+(x+y));
    }
}
