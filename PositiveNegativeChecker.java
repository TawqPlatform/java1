package PositiveNegativeChecker;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class PositiveNegativeChecker {


    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the entered number
        double number = in.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) { // positive
            System.out.println(number + " is positive");
        } else if (number < 0) { // negative
            System.out.println(number + " is negative");
        } else { // not one of the above, so it is zero
            System.out.println(number + " is zero");
        }
    }
}
