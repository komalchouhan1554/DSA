package Palindrome_String;

import java.util.Scanner;

public class Reversal_approach {

    static boolean isPalindrome(String s)
    {
        String rev=new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (isPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
