package src;

class StaticBlockDemo {
    static int value;

    static {
        value = 42;
        System.out.println("Static block executed. Value initialized to " + value);
    }

    public static void main(String[] args) {
        System.out.println("Accessing static variable: " + value);
    }
}
