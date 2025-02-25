package src;

public class test123{
double side1;
void read(double side1){
    side1=side1;
}
double area(){
return side1*side1;
}
public static void main(String args[]){
test123 s=new test123();
s.read(3.5);
System.out.println("Area of the square="+s.area());
}
}