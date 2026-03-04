
import java.util.Scanner;

public class Admission {

    public static void applyCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course ID to apply: ");
        int courseId = sc.nextInt();

        System.out.println("Application submitted successfully!");
    }

    public static void checkStatus() {
        System.out.println("Admission Status: Pending");
    }
}
