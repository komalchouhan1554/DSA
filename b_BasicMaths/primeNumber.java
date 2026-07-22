import java.util.Scanner;

class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        boolean flag =sol.isPrime(n);
        System.out.println(flag);
        sc.close();
    }
}
class Solution {
    public boolean isPrime(int n) {
          //your code goes here
          if(n<=1)
          {
            return false;
          }
          for(int i=2;i*i<=n;i++)
          {
            if(n%i==0)
            {
                return false;
            }
          }
          return true;
    }
}