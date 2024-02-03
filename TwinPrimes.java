package TwinPrimes;

/**
 *
 * @author Tawq.pro
 */
public class TwinPrimes {
    public static void main(String[] args) {
        System.out.println("Twins prime between 1 to 100 are: ");
        for (int i = 1; i < 100; i++) {
            if(isPrime(i) && isPrime(i+2))
                System.out.println("("+ i + ", " + (i+2) + ")");
        }
    }


    public static boolean isPrime(int num){
        if(num < 2) return false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
