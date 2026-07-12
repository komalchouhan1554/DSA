import java.util.Scanner;

public class Pattern21{
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
         
            for (int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
}

