package MiddleCharacter;

import java.util.Scanner;

/**
 *
 * @author Tawq.pro
 */
public class MiddleCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = in.nextLine();
        String mid = middle(inputString);
        System.out.println("middle = " + mid);
    }

    public static String middle(String str) {
        int start;
        int length;
        if (str.length() % 2 == 0) {
            start = str.length() / 2 - 1;
            length = 2;
        } else {
            start = str.length() / 2;
            length = 1;
        }
        return str.substring(start, start + length);
    }

}
