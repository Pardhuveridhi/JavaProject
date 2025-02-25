package src;

class Student1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.setName("John");
        student.setAge(20);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
