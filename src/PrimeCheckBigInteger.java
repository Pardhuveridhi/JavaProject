package src;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeCheckBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to check if it's prime: ");
        String input = scanner.next(); // Use String to handle large numbers

        BigInteger number = new BigInteger(input);

        // BigInteger's isProbablePrime method
        if (number.isProbablePrime(10)) {
            System.out.println(number + " is probably a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
