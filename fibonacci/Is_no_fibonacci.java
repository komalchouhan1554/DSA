package fibonacci;

import java.util.Scanner;
//5*X² + 4  OR  5*X² − 4


public class Is_no_fibonacci {
    static boolean squrt(long x)
    {
        long s=(long) Math.sqrt(x);
        return s*s==x;
    }
    static boolean fib(int n)
    {
        return squrt(5*n*n+4)||squrt(5*n*n-4);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
System.out.println(fib(n));
        sc.close();
    }
    
}
