package CountDigits;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count the number of digits
        int count = 0;
        int tempNumber = number;

        // Count digits using a loop
        while (tempNumber > 0) {
            tempNumber /= 10;
            count++;
        }

        // Print the result
        System.out.println(number + " contains " + count + " numbers.");

    }
}
