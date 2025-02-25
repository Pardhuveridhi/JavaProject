package src;

public class UnboxingExample {
    public static void main(String[] args) {
        Integer boxed = Integer.valueOf(20);
        int unboxed = boxed; // Unboxing
        System.out.println("Unboxed: " + unboxed);
    }
}
