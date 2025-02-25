package src;

class StaticNonStaticDemo {
    static int staticVar = 10;
    int nonStaticVar = 20;

    public static void main(String[] args) {
        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non-Static Variable: " + obj.nonStaticVar);
    }
}
