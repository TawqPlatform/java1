package ConcatString;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class ConcatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = in.next();
        System.out.print("Enter your middle name: ");
        String middleName = in.next();
        System.out.print("Enter your last name: ");
        String lastName = in.next();
        
        String fullname = firstName + " " + middleName + " " + lastName;
        System.out.println("Your full-name is " + fullname);
    }
}
