package Rectangle;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class Rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = in.nextInt();
        System.out.print("Enter the height: ");
        double height = in.nextInt();
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        System.out.println("The area = " + area);
        System.out.println("The perimeter = " + perimeter);
        
    }
}
