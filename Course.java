
import java.util.Scanner;

public class Course {

    public static void viewCourses() {
        System.out.println("Available Courses:");
        System.out.println("101 - BCA");
        System.out.println("102 - BBA");
        System.out.println("103 - MCA");
        System.out.println("104 - MBA");
    }

    public static void addCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.println("Course Added Successfully!");
    }
}
