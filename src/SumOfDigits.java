package src;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345, sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        System.out.println("Sum of Digits: " + sum);
    }
}
