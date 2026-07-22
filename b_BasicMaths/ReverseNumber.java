import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        int num=sol.Reverse(n);
        System.out.println(num);
        sc.close();
    }
}
class Solution
{
  public int Reverse(int n)
  {
    int rev=0;
    while(n>0)
    {
      int r=n%10;
      rev=rev*10+r;
      n=n/10;
      
    }
    return rev;
  }
}

