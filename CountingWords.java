package CountingWords;

import java.util.Scanner;

/**
 *
 * @author Tawq.pro
 */
public class CountingWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = in.nextLine();
        int numOfWords = countWords(inputString);
        System.out.println("\""+inputString + "\"" + " has " + numOfWords + " words");
    }
    
    public static int countWords(String str) {
        if (str.isEmpty()) {
            return 0; // No words in an empty 
        }

        int wordsCount = 1; // for the first word

        // to count the rest of the string 
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') 
                wordsCount++;
        }

        return wordsCount;
    }

}
