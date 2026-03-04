
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);

    public void registerStudent() {
        System.out.println("---- Student Registration ----");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Create Password: ");
        String password = sc.nextLine();

        System.out.println("Registration Successful!");
    }

    public void loginStudent() {
        System.out.println("---- Student Login ----");

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("Login Successful!");

        studentMenu();
    }

    public void studentMenu() {
        while (true) {
            System.out.println("\n--- Student Dashboard ---");
            System.out.println("1. View Courses");
            System.out.println("2. Apply for Course");
            System.out.println("3. Check Admission Status");
            System.out.println("4. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Course.viewCourses();
                    break;
                case 2:
                    Admission.applyCourse();
                    break;
                case 3:
                    Admission.checkStatus();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
