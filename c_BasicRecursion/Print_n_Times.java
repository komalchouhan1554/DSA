import java.util.Scanner;

class Print_n_Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println("---------------------------");
        Solution s = new Solution();
        s.Print(str, n);
        sc.close();
    }

}

class Solution {
    int count = 0;

    public void Print(String str, int n) {
        if (count == n)
            return;

        System.out.println(str);
        count++;

        Print(str, n);

    }
}