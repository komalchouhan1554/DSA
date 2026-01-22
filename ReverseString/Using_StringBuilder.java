package ReverseString;

import java.util.Scanner;

public class Using_StringBuilder {

static  String ReverseString(String s)
{
    return new StringBuilder(s).reverse().toString();
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(ReverseString(s));
        sc.close();
        
    }
    
}
