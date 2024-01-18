package GreatestNumberFinder2;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class GreatestNumberFinder2 {
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

        // Find the greatest number using if else-if else statements
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The greatest number is " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The greatest number is " + number2);
        } else {
            System.out.println("The greatest number is " + number3);
        }
    }
}
