import java.util.Scanner;

public class GPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the GPA Calculator!");

        // retrieve course name and code
//        System.out.print("Course and code. e.g MAT 101: ");
//        String nameOfCourse = scanner.nextLine();
//
//        // retrieve total number of courses
//        System.out.print("Enter the number of courses: ");
//        int numberOfCourses = scanner.nextInt();
//
//        double totalGradePoints = 0;
//        int totalCourseUnits = 0;
//
//        for (int i = 1; i <= numberOfCourses; i++) {
//            System.out.println("\nCourse " + i + ":");
//
//            System.out.print("Enter the grade (A, B, C, D, or F): ");
//            char grade = scanner.next().charAt(0);
//
//            System.out.print("Enter the units for the course: ");
//            int courseUnits = scanner.nextInt();
//
//            double gradePoints = calculateGradePoints(grade);
//            totalGradePoints += gradePoints * courseUnits;
//            totalCourseUnits += courseUnits;
//        }
//
//        double gpa = totalGradePoints / totalCourseUnits;
//
//        System.out.println("\nGPA Calculation Results:");
//        System.out.println("Total Quality Points: " + totalGradePoints);
//        System.out.println("Total Credit Hours: " + totalCourseUnits);
//        System.out.println("GPA: " + gpa);
//
//        scanner.close();
//    }


    }

//    private static double calculateGradePoints(char grade) {
//        switch (Character.toUpperCase(grade)) {
//            case 'A':
//                return 5.0;
//            case 'B':
//                return 4.0;
//            case 'C':
//                return 3.0;
//            case 'D':
//                return 2.0;
//            case 'F':
//                return 0.0;
//            default:
//                System.out.println("Invalid grade. Assuming grade as F.");
//                return 0.0;
//        }
    }
}
