package src;

class X{
    void calling(){
        System.out.println("X Method");
    }
}

class Y extends X{

    void calling(){
        System.out.println("Y Method");
    }
}

class Z extends X{

    void calling(){
        System.out.println("Z Method");

    }
}

public class InheritanceObjecets {
    public static void main(String arg[]){
        X x= new X();
        Y y= new Y();
        Z z= new Z();
        X x1= new Z();
        X s= new Y();
        x1.calling();

    }
}
