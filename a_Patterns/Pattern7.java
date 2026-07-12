import java.util.Scanner;

public class Pattern7{
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
    for(int j=1;j<=n-i;j++)
    {
        System.out.print (" ");
    }
    for(int j=1;j<=2*i-1;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
}
}
        
 

