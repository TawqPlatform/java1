package IsPrimeMethod;

/**
 *
 * @author Tawq.pro
 */

public class IsPrimeMethod {
    public static void main(String[] args) {
        int x = 5;
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
