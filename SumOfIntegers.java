package SumOfIntegers;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for 10 integers
        System.out.print("Enter 10 numbers separated by spaces: ");
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += scanner.nextInt();
        }

        // Print the sum
        System.out.println("Sum = " + sum);

    }
}
