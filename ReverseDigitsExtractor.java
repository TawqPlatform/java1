package ReverseDigitsExtractor;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class ReverseDigitsExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Extract and print digits in reverse order;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
        // new line
        System.out.println("");
    }
}
