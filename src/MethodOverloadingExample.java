package src;

public class MethodOverloadingExample {
    static int multiply(int a, int b) {
        return a * b;
    }
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.println("Product (2 args): " + multiply(5, 10));
        System.out.println("Product (3 args): " + multiply(5, 10, 2));
    }
}
