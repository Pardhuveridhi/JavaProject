package src;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1 == s2); // False
        System.out.println(s1.equals(s2)); // True
    }
}
