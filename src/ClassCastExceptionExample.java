package src;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        try {
            Integer number = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}
