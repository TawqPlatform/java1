package CheckPrime;

import java.util.Scanner;

/**
 *
 * @author Tawq.pro
 */
public class CheckPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        boolean isPrime = true;
        
        for (int i = 2; i < num; i++) {
            if(num % i == 0)
                isPrime = false;
        }
        
        if(isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is NOT a prime number");
        
    }
}
