import java.util.Scanner;

class Print_Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("---------------------------");
        Solution s = new Solution();
        System.out.println(s.SumOfN(n));
        sc.close();
    }

}

class Solution {
    int sum = 0;

    public int SumOfN(int n) {
        if (n == 0)
            return sum;

        sum = sum + n;

        SumOfN(n - 1);
        return sum;
    }
}