package fibonacci;

import java.util.Scanner;

public class iterative_approach {

    public static void fibonacci(int n)
    {
        int fib[]=new int[n];
        fib[0]=0;
        fib[1]=1;
      for (int i=2;i<n;i++)
      {
       fib[i]=fib[i-1]+fib[i-2];
      }
      for (int i : fib) {
        System.out.print(i+ " ");
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();
    }
    
}
