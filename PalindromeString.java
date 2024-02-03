package PalindromeString;

import java.util.Scanner;


/**
 *
 * @author Tawq.pro
 */
public class PalindromeString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String txt = in.nextLine();
        
        if(isPalindrome(txt))
            System.out.println(txt + " is palindrome");
        else
            System.out.println(txt + " is not palindrome");
    }


    public static boolean isPalindrome(String str){
        String reverse = "";
        
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse.equals(str);
    }
}
