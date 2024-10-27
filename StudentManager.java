import java.util.Scanner;
 public class StudentManager {
    private Scanner scanner;
    private Student[] students;
    private int studentCount;

    public StudentManager(int maxStudents) {
        this.scanner = new Scanner(System.in);
        this.students = new Student[maxStudents];
        this.studentCount = 0; 
    }

    public void addStudent() {
        if (studentCount >= students.length) {
            System.out.println("Cannot add more students. Maximum capacity reached.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter course code: ");
        int courseCode = scanner.nextInt();
        scanner.nextLine(); 

        Course course = new Course(courseName, courseCode);
        Student student = new Student(name, id, course);
        students[studentCount++] = student; 
        System.out.println("Student added successfully!");
    }

    public void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                // Shift students to fill the gap
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null; // Remove the last student
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                students[i].displayStudentInfo();
            }
        }
    }

    public void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                System.out.print("Enter new student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new course name: ");
                String courseName = scanner.nextLine();
                System.out.print("Enter new course code: ");
                int courseCode = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                Course course = new Course(courseName, courseCode);
                students[i] = new Student(name, id, course); // Update student
                students[i].displayStudentInfo();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                students[i].displayStudentInfo();
                return;
            }
        }
        System.out.println("Student not found!");
    }
}

