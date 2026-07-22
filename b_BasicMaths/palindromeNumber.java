import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        boolean flag =sol.isPalindrome(n);
        System.out.println(flag);
        sc.close();
    }
}
class Solution
{
    public boolean isPalindrome(int n) {

        if (n < 0) {
            return false;
        }

        int original = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev == original;
    }
}