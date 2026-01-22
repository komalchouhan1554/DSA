package Palindrome_String;

import java.util.Scanner;

public class Two_Pointer_Approach {
    static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else return false;
        }
        return true;
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
