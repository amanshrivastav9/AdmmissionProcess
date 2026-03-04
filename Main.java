
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Admin admin = new Admin();

        while (true) {
            System.out.println("===== COLLEGE ADMISSION SYSTEM =====");
            System.out.println("1. Student Registration");
            System.out.println("2. Student Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    student.registerStudent();
                    break;
                case 2:
                    student.loginStudent();
                    break;
                case 3:
                    admin.adminLogin();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
