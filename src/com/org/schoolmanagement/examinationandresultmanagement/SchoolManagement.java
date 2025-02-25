package src.com.org.schoolmanagement.examinationandresultmanagement;

import com.org.schoolmanagement.student.Student;

import java.util.*;


class ExaminationManagement {
    private final Map<String, String> examSchedule = new LinkedHashMap<>();
    private final Map<String, String> hallAllotment = new HashMap<>();
    private final Map<String, String> invigilationAllotment = new HashMap<>();
    private final Map<Integer, String> studentAllotment = new HashMap<>();
    private final Map<Integer, String> results = new HashMap<>();
    private final List<Student> students;

    public ExaminationManagement(List<Student> students) {
        this.students = students;
    }

    public void Examination() {
        String[] subjects = {"English", "Telugu", "Hindi", "Mathematics", "Physics", "Chemistry", "Social"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] halls = {"Hall A", "Hall B", "Hall C", "Hall D", "Hall E", "Hall F", "Hall G"};
        String[] invigilators = {"Mr. Sharma", "Ms. Patel", "Mr. Reddy", "Ms. Iyer", "Mr. Khan", "Ms. Bose", "Mr. Gupta"};

        for (int i = 0; i < subjects.length; i++) {
            examSchedule.put(subjects[i], days[i % days.length]);
            hallAllotment.put(subjects[i], halls[i]);
            invigilationAllotment.put(halls[i], invigilators[i]);
        }

        for (int i = 0; i < students.size(); i++) {
            studentAllotment.put(i + 1, halls[i % halls.length]);
        }

        System.out.println("Exam Scheduling: " + examSchedule);
        System.out.println("Examination Halls: " + hallAllotment);
        System.out.println("Invigilation Allotment: " + invigilationAllotment);
        System.out.println("Student Allotment: " + studentAllotment);
    }

    public void Results() {
        for (int i = 0; i < students.size(); i++) {
            results.put(i + 1, (i + 1) % 3 == 0 ? "Failed" : "Passed");
        }

        System.out.println("Result Processing: Done");
        System.out.println("Result Declaration: " + results);
        System.out.println("Progress Distribution: Report Cards Sent");
        System.out.println("Performance Analysis: Student performance analyzed");
    }
}


public class SchoolManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEntering details for Student " + (i + 1));
            Student student = new Student();
            student.admissionRegistration();
            student.studentDetails();
            students.add(student);
        }

        ExaminationManagement examManager = new ExaminationManagement(students);
        System.out.println("--- Examination Details ---");
        examManager.Examination();
        
        System.out.println("\n--- Results Details ---");
        examManager.Results();
    }
}
