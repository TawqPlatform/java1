package CharacterReplacer;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class CharacterReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a string
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();

        // Get user input for the character to replace
        System.out.print("Which character you want to replace? ");
        char targetChar = scanner.next().charAt(0);

        // Get user input for the character to set instead
        System.out.print("Which character you want to set instead? ");
        char replacementChar = scanner.next().charAt(0);

        // Replace characters in the string
        String replacedString = "";

        // Loop through each character in the original string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check if the character is the target character
            if (currentChar == targetChar) {
                // Replace the character with the replacement character
                replacedString += replacementChar;
            } else {
                // Keep the original character
                replacedString += currentChar;
            }
        }

        // Print the result
        System.out.println("String after replacement: " + replacedString);

    }
}
