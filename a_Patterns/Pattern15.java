import java.util.Scanner;

public class Pattern15 {
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
         char c='A';   
            for(int j=n;j>=i;j--)
            {
                System.out.print(c);
                c++;
            }
        
             System.out.println();
        }
    }
}

