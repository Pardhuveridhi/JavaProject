package src;

class AccessDemo {
    static int staticVar = 50;
    static int nonStaticVar = 100;

    public static void main(String[] args) {
        int x= (int) displayStatic();
        x+= 1; //staticVar = staticVar + 1;
        System.out.println("Static Variable: " + x);
        displayNonStatic();
        int y= (int) displayStatic();
        y+=10;
        System.out.println("Static Variable: " + y);
    }

    static double displayStatic() {
        return staticVar;
    }

    static void displayNonStatic() {
        nonStaticVar+= 1;
        System.out.println("Non-Static Variable: " + nonStaticVar);
    }
}
