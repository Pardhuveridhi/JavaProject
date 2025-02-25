package src;

public class Test {
    public static void main(String[] args){
        int a =10;
        int b= 20;
        int c = sub(a,b);
        System.out.println("c = "+ c);
    }

    public static int sub(int x,int y){
        return x-y;
    }
}
