package DivisibilityChecker;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        // Check divisibility by 5 and 11
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else if (number % 11 == 0) {
            System.out.println(number + " is divisible by 11");
        } else {
            System.out.println(number + " is not divisible by either 5 or 11");
        }
    }
}
