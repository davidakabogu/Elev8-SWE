package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
public class RetrieveUserInfo {
    private static final Scanner scanner = new Scanner(System.in);
    public static int getNumberOfCourses() {
        int numberOfCourses = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the number of courses: ");
                numberOfCourses = scanner.nextInt();
                validInput = true; // Input is valid; exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }
        return numberOfCourses;
    }
    public static String getCourseName() {
        System.out.print("Enter the course name and code: ");
        scanner.nextLine();
        return scanner.nextLine().trim();
    }
    public static int getCourseUnits() {
        int courseUnits = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the number of units for the course: ");
                courseUnits = scanner.nextInt();
                validInput = true; // Input is valid; exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for course units.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }
        return courseUnits;
    }
    public static double getCourseScore() {
        double courseScore = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the score for the course: ");
                courseScore = scanner.nextDouble();
                validInput = true; // Input is valid; exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid numeric score.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }
        return courseScore;
    }
}
