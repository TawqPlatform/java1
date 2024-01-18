package TriangleTypeChecker;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the three sides of the triangle
        System.out.print("Enter the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side: ");
        double side3 = scanner.nextDouble();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Check the type of the triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }
    }
}
