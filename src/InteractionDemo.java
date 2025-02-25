package src;

class InteractionDemo {
    static int staticVar = 10;

    static void staticMethod() {
        System.out.println("Static Method Accessing Static Variable: " + staticVar);
    }

    void nonStaticMethod() {
        System.out.println("Non-Static Method Accessing Static Variable: " + staticVar);
        staticMethod();
    }

    public static void main(String[] args) {
        InteractionDemo obj = new InteractionDemo();
        obj.nonStaticMethod();
    }
}