package src;

public class DefaultValues{

    int i;
    float f;
    byte b;
    double d;
    long l;
    boolean boo;
    char c;
    short s;
    String str;

    public static void main(String args[]){
        System.out.println("Let's know the default values of the Java variables");
        DefaultValues def = new DefaultValues();
        System.out.println("Default Int = "+def.i);
        System.out.println("Default float = "+def.f);
        System.out.println("Default byte = "+def.b);
        System.out.println("Default double = "+def.d);
        System.out.println("Default long = "+def.l);
        System.out.println("Default boolean = "+def.boo);
        System.out.println("Default char = "+def.c);
        System.out.println("Default short = "+def.s);
        System.out.println("Default String = "+def.str);
    }
}