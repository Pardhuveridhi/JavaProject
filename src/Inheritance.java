package src;

class Grandparent {
    Grandparent() {
        System.out.println("Grandparent's Constructor Called");
    }
    int i=10;
}

class Parent extends Grandparent {
    Parent() {
        System.out.println("Parent's Constructor Called");
    }
    int j=20;
}

class Child extends Parent {
    Child() {
        System.out.println("Child's Constructor Called");
    }
    int k=30;
}

public class Inheritance {
    public static void main(String[] args) {
        Grandparent gp= new Grandparent();
        Child c = new Child();
        Parent p = new Parent();
        Parent p1 = new Child();
        Grandparent g1 = new Parent();
        Grandparent g2 = new Child();
        System.out.println("Value of i  = "+c.i);
        System.out.println("Value of j  = "+c.j);
        System.out.println("Value of k  = "+c.k);
    }
}
