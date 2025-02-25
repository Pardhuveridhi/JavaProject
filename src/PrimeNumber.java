package src;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 20;
        boolean isPrime = true;
        if(number!=0) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        else{
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}