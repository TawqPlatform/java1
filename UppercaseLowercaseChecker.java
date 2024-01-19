package UppercaseLowercaseChecker;
/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class UppercaseLowercaseChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Check if the character is an uppercase or lowercase alphabet 
        if (inputChar >= 'A' && inputChar <= 'Z') {
            System.out.println(inputChar + " is an uppercase letter.");
        } else if (inputChar >= 'a' && inputChar <= 'z') {
            System.out.println(inputChar + " is a lowercase letter.");
        } else {
            System.out.println(inputChar + " is not a letter.");
        }
    }
}
