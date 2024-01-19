package Calculator;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Read the user's choice as a char
        System.out.print("Enter the operation symbol: ");
        char operationChoice = scanner.next().charAt(0);

        // Perform the chosen operation and display the result
        double result = 0;

        switch (operationChoice) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    // Exit the program if there's an attempt to divide by zero
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
                // Exit the program for an invalid operation
                System.exit(0);
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
