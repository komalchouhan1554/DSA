import java.util.Scanner;

public class Pattern10{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Solution s=new Solution();
        s.pattern(n);
    }
}

class Solution {
    public void pattern(int n) {
     /*  
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        } */

        
        for (int i=1;i<=2*n-1;i++)
        {
            int star=i;
            if (i>n)
            star=2*n-i;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
