package logic;
public class ConvertScore {
    public static String convertToLetterGrade(double score) {
        if (score >= 70 && score <= 100) {
            return "A";
        } else if (score >= 60 && score < 70) {
            return "B";
        } else if (score >= 50 && score < 60) {
            return "C";
        } else if (score >= 45 && score < 50) {
            return "D";
        } else if (score >= 40 && score < 45) {
            return "E";
        } else if (score >= 0 && score < 40) {
            return "F";
        } else {
            return "Invalid Score";
        }
    }

    public static double convertToNumericGrade(double score) {
        String letterGrade = convertToLetterGrade(score);

        return switch (letterGrade.toUpperCase()) {
            case "A" -> 5.0;
            case "B" -> 4.0;
            case "C" -> 3.0;
            case "D" -> 2.0;
            case "E" -> 1.0;
            case "F" -> 0.0;
            default -> -1.0; // Indicate an invalid letter grade
        };
    }
}