package src.com.org.schoolmanagement.classandsubject;

import java.util.*;

class ClassAndSubjectManagement {
    private int className;
    private Map<String, String> subjectTeacherMap;
    private Map<String, String> syllabusTracking;
    private Map<String, List<String>> dailyTimetable;

    private static final String[] BASE_SUBJECTS = {
        "English", "Telugu", "Hindi", "Mathematics", "Physics", "Chemistry", "Social"
    };

    private static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public void classDetails() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Class (1 to 10): ");
            if (scanner.hasNextInt()) {
                className = scanner.nextInt();
                scanner.nextLine();

                if (className >= 1 && className <= 10) {
                    break;
                } else {
                    System.out.println("Invalid class. Please enter a number between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        subjectTeacherMap = new HashMap<>();
        System.out.println("\nAssign Teachers to the Following Subjects:");
        for (String subject : BASE_SUBJECTS) {
            System.out.print("Enter Teacher Name for " + subject + ": ");
            String teacher = scanner.nextLine();
            subjectTeacherMap.put(subject, teacher);
        }

        generateTimetable();
    }

    public void subjectDetails() {
        Scanner scanner = new Scanner(System.in);
        syllabusTracking = new HashMap<>();

        System.out.println("\nEnter Syllabus Completion Percentage for Each Subject:");
        for (String subject : BASE_SUBJECTS) {
            while (true) {
                System.out.print(subject + ": ");
                String progressInput = scanner.nextLine();

                try {
                    int progress = Integer.parseInt(progressInput);
                    if (progress >= 0 && progress <= 100) {
                        syllabusTracking.put(subject, progress + "% completed");
                        break;
                    } else {
                        System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric percentage.");
                }
            }
        }
    }

    private void generateTimetable() {
        dailyTimetable = new HashMap<>();
        List<String> subjectPool = new ArrayList<>(Arrays.asList(BASE_SUBJECTS));
        Random random = new Random();

        for (String day : DAYS) {
            List<String> dailySubjects = new ArrayList<>();
            Collections.shuffle(subjectPool, random);
            for (int i = 0; i < 7; i++) {
                dailySubjects.add(subjectPool.get(i));
            }
            dailyTimetable.put(day, dailySubjects);
        }
    }

    public void displayClassDetails() {
        System.out.println("\n--- Class Details ---");
        System.out.println("Class: " + className);
        System.out.println("Subjects and Teachers:");
        for (Map.Entry<String, String> entry : subjectTeacherMap.entrySet()) {
            System.out.println("- " + entry.getKey() + " taught by " + entry.getValue());
        }

        System.out.println("\n--- Weekly Timetable ---");
        for (String day : DAYS) {
            System.out.println(day + ": " + dailyTimetable.get(day));
        }
    }

    public void displaySubjectDetails() {
        System.out.println("\n--- Subject Syllabus Tracking ---");
        for (Map.Entry<String, String> entry : syllabusTracking.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void searchDetails() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nSearch by (Class, Subject, Teacher) or type 'exit' to quit: ");
            String searchInput = scanner.nextLine().trim();

            if (searchInput.equalsIgnoreCase("exit")) {
                break;
            } else if (searchInput.matches("\\d+")) {
                int classSearch = Integer.parseInt(searchInput);
                if (classSearch == className) {
                    displayClassDetails();
                    displaySubjectDetails();
                } else {
                    System.out.println("No data found for class " + classSearch);
                }
            } else if (subjectTeacherMap.containsKey(searchInput)) {
                System.out.println("\n--- Subject Details for Class " + className + " ---");
                System.out.println("Subject: " + searchInput);
                System.out.println("Teacher: " + subjectTeacherMap.get(searchInput));
                System.out.println("Syllabus Completion: " + syllabusTracking.get(searchInput));

                System.out.println("\n--- Class Timetable ---");
                for (String day : DAYS) {
                    if (dailyTimetable.get(day).contains(searchInput)) {
                        System.out.println(day + ": " + dailyTimetable.get(day));
                    }
                }
            } else if (subjectTeacherMap.containsValue(searchInput)) {
                System.out.println("\n--- Teacher Details for Class " + className + " ---");
                System.out.println("Teacher: " + searchInput);
                System.out.println("Subjects taught:");
                for (Map.Entry<String, String> entry : subjectTeacherMap.entrySet()) {
                    if (entry.getValue().equalsIgnoreCase(searchInput)) {
                        System.out.println("- " + entry.getKey() + " (" + syllabusTracking.get(entry.getKey()) + ")");
                    }
                }

                System.out.println("\n--- Timetable for Teacher " + searchInput + " ---");
                for (String day : DAYS) {
                    List<String> schedule = new ArrayList<>();
                    for (String subject : dailyTimetable.get(day)) {
                        if (subjectTeacherMap.get(subject).equalsIgnoreCase(searchInput)) {
                            schedule.add(subject);
                        }
                    }
                    if (!schedule.isEmpty()) {
                        System.out.println(day + ": " + schedule);
                    }
                }
            } else {
                System.out.println("No matching data found. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ClassAndSubjectManagement classManager = new ClassAndSubjectManagement();

        classManager.classDetails();
        classManager.subjectDetails();

        classManager.displayClassDetails();
        classManager.displaySubjectDetails();
        classManager.searchDetails();
    }
}
