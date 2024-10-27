import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager sr = new StudentManager(100); // Define maximum number of students
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Update Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    sr.addStudent();
                    break;
                case 2:
                    sr.removeStudent();
            
                    break;
                case 3:
                    sr.displayStudents();
                    break;
                case 4:
                    sr.updateStudent();
                    break;
                case 5:
                    sr.searchStudent();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

