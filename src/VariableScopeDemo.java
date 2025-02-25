package src;

public class VariableScopeDemo {
    static int globalVariable = 100;

    public static void main(String[] args) {
        int localVariable = 50;

        System.out.println("Global Variable: " + globalVariable);
        System.out.println("Local Variable: " + localVariable);

        displayGlobalVariable();
    }

    public static void displayGlobalVariable() {
        System.out.println("Accessing Global Variable in another method: " + globalVariable);
    }
}
