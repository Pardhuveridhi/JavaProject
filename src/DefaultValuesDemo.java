package src;

public class DefaultValuesDemo {
    // Global variables with default values
    static byte byteValue;
    static short shortValue;
    static int intValue;
    static long longValue;
    static float floatValue;
    static double doubleValue;
    static char charValue;
    static boolean booleanValue;

    public static void main(String[] args) {
        System.out.println("Default values of primitive data types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: [" + charValue + "]");
        System.out.println("boolean: " + booleanValue);
    }
}
