import java.util.Scanner;

class Print_till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("---------------------------");
        Solution s = new Solution();
        s.Print(n);
        sc.close();

    }

}

class Solution {
    int count = 1;

    public void Print(int n) {
        if (count > n)
            return;

        System.out.println(count);
        count++;

        Print(n);

    }
}