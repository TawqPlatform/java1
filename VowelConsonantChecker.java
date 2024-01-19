package VowelConsonantChecker;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a single character
        System.out.print("Enter a letter: ");
        String userInput = scanner.nextLine();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Check the length of the input
        if (userInput.length() == 1) {
            char letter = userInput.charAt(0);

            // Check if the character is a letter
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                // Check if the character is a vowel or consonant
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                    System.out.println(letter + " is a vowel");
                } else {
                    System.out.println(letter + " is a consonant");
                }
            } else {
                System.out.println("Error: Please enter a valid letter.");
            }
        } else {
            System.out.println("Error: Please enter only a single character.");
        }
    }
}
