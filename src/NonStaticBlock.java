package src;

public class NonStaticBlock{

    NonStaticBlock(){
        System.out.println("From NonStaticBlock Constructor");
    }
    public static void main(String[] args){
        NonStaticBlock nonBlock = new NonStaticBlock();
        System.out.println("From NonStaticBlock main");
        NonStaticBlock nonBlock5 = new NonStaticBlock();
    }
    static{
        System.out.println("+++++++++++From Static  Block 1++++++++++++++");
        NonStaticBlock nonBlock1 = new NonStaticBlock();
        System.out.println("++++++++++++From Static Block 1++++++++++++++++");
        NonStaticBlock nonBlock2 = new NonStaticBlock();
    }

    {
        System.out.println("**************From Non Static Block************");
    }
    static{
        NonStaticBlock nonBlock3 = new NonStaticBlock();
        System.out.println("_____________From Static Block 2________________");
        NonStaticBlock nonBlock4 = new NonStaticBlock();
        System.out.println("____________From Static Block 2_________________");
    }
}