package TwoMaxNumbersFinder;

/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class TwoMaxNumbersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max1 = Integer.MIN_VALUE; // Initialize max1 to the smallest possible integer
        int max2 = Integer.MIN_VALUE; // Initialize max2 to the smallest possible integer

        System.out.print("Enter numbers (0 to end): ");

        int num;
        do {
            num = scanner.nextInt();

            if (num != 0) {
                if (num > max1) {
                    max2 = max1; // Move the previous max1 to max2
                    max1 = num; // Update max1 with the new maximum
                } else if (num > max2) {
                    max2 = num; // Update max2 with the new maximum
                }
            }
        } while (num != 0);

        if (max1 != Integer.MIN_VALUE) {
            System.out.println("Max number: " + max1);
            System.out.println("Second max number: " + (max2 != Integer.MIN_VALUE ? max2 : "N/A"));
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
