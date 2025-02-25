package src;

class Class2 {
    int num = 100;
}

public class MyClass extends Class2{
    public void display(){
        int num= 500;
        System.out.println("LV "+num);
        System.out.println("GV "+super.num);
    }
    public static void main(String args[]){
        MyClass cl= new MyClass();
        cl.display();
    }
}