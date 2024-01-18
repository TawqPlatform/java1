package TempConvertor;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class TempConvertor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the degree in Fahrenheit: ");
        double fahrenheit = in.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
