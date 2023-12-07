import java.util.Scanner;

public class RetrieveUserInfo {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getNumberOfCourses() {
        System.out.print("Enter the number of courses: ");
        return scanner.nextInt();
    }

    public static String getCourseName() {
        System.out.print("Enter the course name and code: ");
        scanner.nextLine();
        return scanner.nextLine().trim();
    }

    public static int getCourseUnits() {
        System.out.print("Enter the number of units for the course: ");
        return scanner.nextInt();
    }
    public static double getCourseScore() {
        System.out.print("Enter the score for the course: ");
        return scanner.nextDouble();
    }
}