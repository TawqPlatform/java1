package VowelCounter;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a string
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();

        // Count vowels in the string
        int vowelCount = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        inputString = inputString.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Print the result
        System.out.println("The entered string has " + vowelCount + " vowels.");
    }
}
