package src;

public class FinalVariable {
    public static void main(String[] args) {
        int CONSTANT = 10;
        final double pie= 3.14;
        System.out.println("Constant: " + CONSTANT);
        System.out.println("Pie value: "+pie);
        CONSTANT = 20;
        System.out.println("Constant: " + CONSTANT);
        System.out.println("Pie value: "+pie);
    }
}
