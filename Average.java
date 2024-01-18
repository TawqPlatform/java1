package Average;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class Average {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();
        
        System.out.println("The average = " + (num1+num2+num3)/3.0);
        
    }
}
