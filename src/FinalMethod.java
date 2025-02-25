package src;

class BaseClass {
    final void display() {
        System.out.println("Final method in base class.");
    }
}
class DerivedClass extends BaseClass {
}
public class FinalMethod {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display();
    }
}
