package src;

class Shape {
    Shape() {
        System.out.println("Shape's Constructor Called");
    }
    int sides = 4;
}

class Rectangle extends Shape {
    Rectangle() {
        System.out.println("Rectangle's Constructor Called");
    }
    int length = 10;
    int width = 5;
}

class Square extends Rectangle {
    Square() {
        System.out.println("Square's Constructor Called");
    }
    int sideLength = 4;
}

class Kite extends Shape {
    Kite() {
        System.out.println("Triangle's Constructor Called");
    }
    int base = 6;
    int height = 8;
}

public class InheritanceExample4 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Kite Kite = new Kite();
        Rectangle r1 = new Square();
        Shape s1 = new Rectangle();
        Shape s2 = new Square();
        Shape s3 = new Kite();
        
        System.out.println("Value of sides (Square) = " + square.sides);
        System.out.println("Value of length (Square) = " + square.length);
        System.out.println("Value of width (Square) = " + square.width);
        System.out.println("Value of sideLength (Square) = " + square.sideLength);
        System.out.println("Value of sides (Kite) = " + Kite.sides);
        System.out.println("Value of base (Kite) = " + Kite.base);
        System.out.println("Value of height (Kite) = " + Kite.height);
    }
}
