package DigitInWords;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class DigitInWords {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a digit
        System.out.print("Enter a digit (0-9): ");
        int digit = scanner.nextInt();

        // Validate the input range
        if (digit >= 0 && digit <= 9) {
            // Print the digit in words without using a method
            switch (digit) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else {
            System.out.println("Error: Please enter a valid digit (0-9).");
        }
    }
}
