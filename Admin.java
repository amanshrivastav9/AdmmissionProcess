
import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);

    public void adminLogin() {
        System.out.println("---- Admin Login ----");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(user.equals("admin") && pass.equals("admin123")){
            adminMenu();
        } else {
            System.out.println("Invalid login!");
        }
    }

    public void adminMenu() {
        while(true){
            System.out.println("\n--- Admin Panel ---");
            System.out.println("1. View Students");
            System.out.println("2. View Applications");
            System.out.println("3. Add Course");
            System.out.println("4. Logout");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Displaying students...");
                    break;
                case 2:
                    System.out.println("Displaying applications...");
                    break;
                case 3:
                    Course.addCourse();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
