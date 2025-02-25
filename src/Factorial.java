package src;

public class Factorial {
    public static void main(String[] args) {
        int number = 5, fact = 1;
        int i = 1;
        while (i <= number) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial: " + fact);
    }
}
