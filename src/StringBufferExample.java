package src;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.insert(4, " Programming");
        sb.delete(5, 16);
        System.out.println(sb);
    }
}
