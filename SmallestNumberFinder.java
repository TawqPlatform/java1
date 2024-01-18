package SmallestNumberFinder;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class SmallestNumberFinder {
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

        // Find the smallest number using conditional statements
        double smallestNumber;

        if (number1 <= number2 && number1 <= number3) {
            smallestNumber = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallestNumber = number2;
        } else {
            smallestNumber = number3;
        }

        // Print the result
        System.out.println("The smallest number is " + smallestNumber);
    }
}
