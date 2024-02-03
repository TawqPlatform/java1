package CountingVowels;

import java.util.Scanner;

/**
 *
 * @author Tawq.pro
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = in.nextLine();
        int result = countVowels(inputString);
        System.out.println("Number of vowels in \"" + inputString + "\": " + result);
    }
    
    public static int countVowels(String str) {
        if (str.isEmpty()) {
            return 0; // No vowels in an empty or null string
        }

        // Convert the input string to lowercase for case-insensitive counting
        str = str.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the current character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

}
