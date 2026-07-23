import java.util.Scanner;

class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("---------------------------");
        Solution s = new Solution();
        int fib = s.fibbonaci(n);
        System.out.println(fib);
        sc.close();
    }

}

class Solution {
    public int fibbonaci(int n) {
        if (n <= 1)
            return n;

        return fibbonaci(n - 1) + fibbonaci(n - 2);
    }
}