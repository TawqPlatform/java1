package PracticeMath;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class PracticeMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt(); // e.g 7
        int nn = n * 10 + n; // e.g 70 + 7 = 77
        int nnn = n * 100 + nn; // e.g 700 + 77 = 777
        int result = n + nn + nnn;
        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
    }
}
