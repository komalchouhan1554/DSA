import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("---------------------------");
        Solution s = new Solution();
        System.out.println(s.factorial(n));
        sc.close();

    }

}

class Solution {

    int Fact = 1;

    public int factorial(int n) {

        if (n == 0)
            return Fact;

        Fact = Fact * n;

        factorial(n - 1);
        return Fact;
    }
}