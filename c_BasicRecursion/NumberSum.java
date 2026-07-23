import java.util.Scanner;

class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("---------------------------");
        Solution s = new Solution();
        int sum = s.SumOfN(n, 0);
        System.out.println(sum);
        sc.close();
    }

}

class Solution {
    public int SumOfN(int n, int i) {
        if (n == 0)
            return i;

        return SumOfN(n - 1, i + n);
    }
}