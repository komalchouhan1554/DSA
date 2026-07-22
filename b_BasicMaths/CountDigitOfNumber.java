import java.util.Scanner;

public class CountDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        int num=sol.CountDigit(n);
        System.out.println(num);
        sc.close();
    }
}
class Solution
{
  public int CountDigit(int n)
  {
    int count=0;
     if (n == 0) {
            count++;
            return count;
     }
    while(n>0)
    {
        count ++;
        n=n/10;
    }
    return count;
  }
}

