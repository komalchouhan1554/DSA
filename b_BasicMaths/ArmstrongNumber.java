import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        boolean flag = sol.isArmstrong(n);
        System.out.println(flag);
        sc.close();
    }
}

class Solution {
    public boolean isArmstrong(int n) {
        int original = n;
       int power = (n == 0) ? 1 : (int) Math.log10(n) + 1;
        double sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + Math.pow(r, power);
            n = n / 10;
        }
        return sum == original;
    }
}
