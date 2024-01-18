package GreatestNumberFinder;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class GreatestNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        // Find the greatest number using conditional statements
        double greatestNumber = number1;

        if (number2 > greatestNumber) {
            greatestNumber = number2;
        }

        if (number3 > greatestNumber) {
            greatestNumber = number3;
        }

        // Print the result
        System.out.println("The greatest number is " + greatestNumber);
    }
}
