import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Solution sol=new Solution();
        int num=sol.gcdnum(n,m);
        System.out.println(num);
        sc.close();
    }
}
class Solution
{
  public int gcdnum(int n,int m)
  {
    while (n>0 &&m>0)
    {
      if(n>m) n=n%m;
      else m=m%n;
    }
    if(n==0) return m;
    else return m;
    
  }
}

