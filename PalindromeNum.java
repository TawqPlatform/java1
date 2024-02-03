package PalindromeNum;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class PalindromeNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        if(isPalindrome(num))
            System.out.println(num + " is palindrome");
        else
            System.out.println(num + " is not palindrome");
    }


    public static boolean isPalindrome(int number){
        int temp = number;
        int remainder;
        int reverse = 0;
        
        while(temp > 0) {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
	      }
        
        return reverse == number;
    }
}
