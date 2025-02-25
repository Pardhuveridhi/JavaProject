package src;

import java.util.Scanner;
class Student {
    private final String std_name;
    public final int id_num;
    private final int std_age;
    static Student[] std;

    Student(String name, int id, int age) {
        std_name = name;
        id_num = id;
        std_age = age;
    }

    public static void studentDetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of students:");
        int tol_num = s.nextInt();
        s.nextLine();
        std = new Student[tol_num];
        for (int i = 0; i < tol_num; i++) {
            System.out.println("Enter Student " + (i + 1) + "  name:");
            String temp_name = s.nextLine();
            System.out.println("Enter the student ID: ");
            int temp_Id = s.nextInt();
            s.nextLine();
            System.out.println("Enter the student Age: ");
            int temp_age = s.nextInt();
            s.nextLine();
            std[i] = new Student(temp_name, temp_Id, temp_age);
        }
    }

    public static void display() {
        System.out.println("Student Details: ");
        for(Student st : std) {
                System.out.println("Student name: " + st.std_name);
                System.out.println("Student Id: " + st.id_num);
                System.out.println("Student Age: " + st.std_age);
            }
        }
    }
public class SchoolManagement {
    public static void main(String[] args){
        Student.studentDetails();
        Student.display();
        }
    }