package IsPrimeMethod;
import java.util.Scanner;
/**
 *
 * @author Tawq.pro
 */

public class IsPrimeMethod {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        if(isPrime(x))
            System.out.println(x + " is a prime number");
        else 
            System.out.println(x + " is not a prime number");
        
    }
    
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
