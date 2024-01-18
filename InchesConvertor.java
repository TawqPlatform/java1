package InchesConvertor;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class InchesConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an inch value: ");
        double inches = in.nextDouble();
        double meters = 0.0254 * inches;
        System.out.println(inches + " inches = " + meters + " meters");
    }
}
