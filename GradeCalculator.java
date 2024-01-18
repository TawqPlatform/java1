package GradeCalculator;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's mark
        System.out.print("Enter the student's mark: ");
        double studentMark = scanner.nextDouble();

        // Determine if the student passes and calculate the grade
        if (studentMark >= 60) {
            System.out.println("The student has passed.");

            // Determine the grade based on the mark
            String grade;
            if (studentMark >= 95) {
                grade = "A+";
            } else if (studentMark >= 90) {
                grade = "A";
            } else if (studentMark >= 85) {
                grade = "B+";
            } else if (studentMark >= 80) {
                grade = "B";
            } else if (studentMark >= 75) {
                grade = "C+";
            } else if (studentMark >= 70) {
                grade = "C";
            } else if (studentMark >= 65) {
                grade = "D+";
            } else {
                grade = "D";
            }

            // Print the grade
            System.out.println("The student's grade is: " + grade);
        } else {
            System.out.println("The student has not passed.");
        }
    }
}
