import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("---------------------------");
        Solution s = new Solution();
        System.out.println(s.isPalindromeString(str, 0));
        sc.close();

    }

}

class Solution {

    public boolean isPalindromeString(String str, int i) {

        if (i >= str.length() / 2)
            return true;

        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;

        return isPalindromeString(str, i + 1);
    }
}