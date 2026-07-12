import java.util.Scanner;

class Pattern11{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Solution s=new Solution();
        s.pattern(n);
    }
}

class Solution {
    public void pattern(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((i+j+1)%2+" ");
            }
            System.out.println();
        }
}
}