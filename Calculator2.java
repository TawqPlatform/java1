package Calculator2;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class Calculator2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the first number: ");
        int num2 = in.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (double)(num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        
    }
}
