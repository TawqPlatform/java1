package AverageOfIntegers;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class AverageOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for 10 integers
        System.out.print("Enter 10 numbers separated by spaces: ");
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += scanner.nextInt();
        }

        // Calculate and print the average
        double average = sum / 10.0;
        System.out.println("Average = " + average);

    }
}
