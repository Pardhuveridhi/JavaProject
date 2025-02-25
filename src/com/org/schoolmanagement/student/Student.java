package src.com.org.schoolmanagement.student;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Student {
    private String admissionStatus;
    private String admissionNumber;
    private String name;
    private LocalDate dob;
    private String parentDetails;
    private String address;
    private String performance;
    private int attendance;

    public void admissionRegistration() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter documentation verification status (Completed/Not Completed): ");
            admissionStatus = scanner.nextLine();

            if (admissionStatus.equalsIgnoreCase("Completed")) {
                break;
            } else if (admissionStatus.equalsIgnoreCase("Not Completed")) {
                System.out.println("Please complete the registration.");
                admissionNumber = "";
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Completed' or 'Not Completed' only.");
            }
        }

        if (!admissionStatus.equalsIgnoreCase("Not Completed")) {
            System.out.print("Enter Admission Number: ");
            admissionNumber = scanner.nextLine();
        }
    }

    public void studentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's Name: ");
        name = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print("Enter student's Date of Birth (DD/MM/YYYY): ");
            String dobInput = scanner.nextLine();

            try {
                dob = LocalDate.parse(dobInput, formatter);

                LocalDate today = LocalDate.now();
                Period period = Period.between(dob, today);
                int age = period.getYears();

                if (dob.isAfter(today)) {
                    System.out.println("Date of birth cannot be in the future. Please enter a valid date.");
                } else if (age > 18) {
                    System.out.println("Age should not be more than 18 years. Please enter a valid date of birth.");
                } else {
                    break;
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter in the format DD/MM/YYYY.");
            }
        }

        System.out.print("Enter Father name: ");
        parentDetails = scanner.nextLine();

        System.out.print("Enter student's Address: ");
        address = scanner.nextLine();

        while (true) {
            System.out.print("Enter student's Performance (Good/Average/Below average): ");
            performance = scanner.nextLine();

            if (performance.equalsIgnoreCase("Good") || performance.equalsIgnoreCase("Average") || performance.equalsIgnoreCase("Below average")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Good', 'Average', or 'Below average' only.");
            }
        }

        while (true) {
            System.out.print("Enter student's Attendance (1-100): ");
            String attendanceInput = scanner.nextLine();

            try {
                attendance = Integer.parseInt(attendanceInput);

                if (attendance >= 1 && attendance <= 100) {
                    break;
                } else {
                    System.out.println("Attendance should be between 1 and 100. Please enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            }
        }
    }

    public void display() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String attendanceCategory;

        if (attendance >= 1 && attendance <= 50) {
            attendanceCategory = "Poor";
        } else if (attendance >= 51 && attendance <= 80) {
            attendanceCategory = "Average";
        } else {
            attendanceCategory = "Excellent";
        }

        System.out.println("\n--- Student Details ---");
        System.out.println("Admission Status: " + admissionStatus);
        System.out.println("Admission Number: " + (admissionNumber.isEmpty() ? "N/A" : admissionNumber));
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + (dob != null ? dob.format(formatter) : "N/A"));
        System.out.println("Father name: " + parentDetails);
        System.out.println("Address: " + address);
        System.out.println("Performance: " + performance);
        System.out.println("Attendance: " + attendance + " (" + attendanceCategory + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEntering details for Student " + (i + 1));

            students[i] = new Student();

            students[i].admissionRegistration();
            students[i].studentDetails();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nDisplaying details for Student " + (i + 1));
            students[i].display();
        }
    }
}