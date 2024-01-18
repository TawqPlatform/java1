package WeekdayName;



/**
 *
 * @author Tawq.pro
 */
import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number representing a day of the week
        System.out.print("Enter a number: ");
        int dayNumber = scanner.nextInt();

        // Display the corresponding weekday name
        String weekdayName;

        switch (dayNumber) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
            default:
                weekdayName = "Invalid day number";
                break;
        }

        // Print the result
        System.out.println(weekdayName);
    }
}
