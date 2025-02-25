package src;

public class StringDemo {
    public static void main(String[] args) {
        // String Examples
        System.out.println("=== String Examples ===");
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring (7, 12): " + str.substring(7, 12));
        System.out.println("Concatenation: " + str.concat(" Welcome to Java."));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // StringBuffer Examples
        System.out.println("\n=== StringBuffer Examples ===");
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);
        stringBuffer.append(" World");
        System.out.println("After append: " + stringBuffer);
        stringBuffer.insert(5, ",");
        System.out.println("After insert: " + stringBuffer);
        stringBuffer.replace(6, 11, "Java");
        System.out.println("After replace: " + stringBuffer);
        stringBuffer.delete(5, 6);
        System.out.println("After delete: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);

        // StringBuilder Examples
        System.out.println("\n=== StringBuilder Examples ===");
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + stringBuilder);
        stringBuilder.append(" World");
        System.out.println("After append: " + stringBuilder);
        stringBuilder.insert(5, ",");
        System.out.println("After insert: " + stringBuilder);
        stringBuilder.replace(6, 11, "Java");
        System.out.println("After replace: " + stringBuilder);
        stringBuilder.delete(5, 6);
        System.out.println("After delete: " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("After reverse: " + stringBuilder);
    }
}
