 import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        s.pattern(n);
    }
}

class Solution {
    public void pattern(int n) {

        for (int i=1;i<=n;i++)
        {
             for(int j=1;j<=i;j++)
               { System.out.print(i);
               }
               System.out.println();
        }    
    }
}




/*

Output: 
5


1
22
333
4444
55555

*/ 