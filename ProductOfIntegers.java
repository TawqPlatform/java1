package ProductOfIntegers;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class ProductOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for 5 integers
        System.out.print("Enter 5 numbers separated by spaces: ");
        int product = 1;

        for (int i = 0; i < 5; i++) {
            product *= scanner.nextInt();
        }

        // Print the product
        System.out.println("Result = " + product);
    }
}
