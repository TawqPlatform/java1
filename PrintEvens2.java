package PrintEvens2;

import java.util.Scanner;

/**
 *
 * @author Tawq.pro
 */
public class PrintEvens2 {

    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}
