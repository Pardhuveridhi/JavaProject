package src;

import java.util.Scanner;
public class firstProgram {
    public static void main(String args[]) {
    System.out.println("This is my first program");
    int a,b;
    Scanner scannerObject= new Scanner(System.in);
    System.out.println("Enter the values of a:");
    a = scannerObject.nextInt();
    System.out.println("Enter the values of b:");
    b = scannerObject.nextInt();
    System.out.println("Addition: "+ add(a,b));
    System.out.println("Multiplication: "+ multiply(a,b));
    System.out.println("Subtraction: "+ sub(a,b));
    System.out.println("Division: "+ division(a,b));
    }
    public static int add(int i,int j){

        return i+j;
    }
    public static int multiply(int i,int j){
        return i*j;
    }
    public static int sub(int i,int j){
        return i-j;
    }
    public static int division(int i,int j){
        return i/j;
    }
    }

