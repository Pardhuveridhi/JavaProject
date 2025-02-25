package src;

public class GlobalLocalInteraction {
    static String greeting = "Hello";

    public static void main(String[] args) {
        String name = "Alice";

        System.out.println(greeting + ", " + name + "!");
        changeGreeting();
        System.out.println("After method call, Greeting: " + greeting);
    }

    public static void changeGreeting() {
        greeting = "Hi";
    }
}
