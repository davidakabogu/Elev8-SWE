package main;

import logic.ConvertScore;
import utils.PrintToConsole;
import utils.RetrieveUserInfo;

public class GPACalculator {
    public static void main(String[] args) {
        int numberOfCourses = RetrieveUserInfo.getNumberOfCourses();

        String[] courseNames = new String[numberOfCourses];
        double[] courseScores = new double[numberOfCourses];
        double[] courseGrades = new double[numberOfCourses];
        int[] courseUnits = new int[numberOfCourses];

        int iterationCount = 1;
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Course #" + iterationCount++);
            courseNames[i] = RetrieveUserInfo.getCourseName();
            courseUnits[i] = RetrieveUserInfo.getCourseUnits();
            double score = RetrieveUserInfo.getCourseScore();
            courseScores[i] = score;

//            work on course score
            double numericGrade = ConvertScore.convertToNumericGrade(score);
            courseGrades[i] = numericGrade;
        }
        PrintToConsole.printCourseDetailsTable(courseNames, courseUnits, courseScores, courseGrades);
    }
}