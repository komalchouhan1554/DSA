package NumberConversion;

import java.util.Scanner;

public class DecimalToBinary {

static int Decimal_binary(int n)
{
    int pow=1;
    int ans=0;
   while(n>0)
    {
        int rem=n%2;
        n=n/2;
         ans=ans+(rem*pow);
         pow=pow*10;
    }
   
return ans;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=Decimal_binary(n);
        System.out.println(result);
        sc.close();
    }
}
