package src;

public class DefaultVsLocal {
    static int globalInt;

    public static void main(String[] args) {
        int localInt = 10;

        System.out.println("Global variable (default value): " + globalInt);
        System.out.println("Local variable: " + localInt);
    }
}
