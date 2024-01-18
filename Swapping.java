package Swapping;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class Swapping {

    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println("Before swapping: ");
        System.out.println("x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: ");
        System.out.println("x = " + x + ", y = " + y);
    }
}
