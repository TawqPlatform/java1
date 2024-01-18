package PrintOdd3;

import java.util.Scanner;

/**
 *
 * @author Tawq.pro
 */
public class PrintOdd3 {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}
