package NumberConversion;

import java.util.Scanner;

public class BinaryToDecimal {

    public static int convertion(int binaryNum)
    {
        int decimalNum=0;
        int pow=1;
        while(binaryNum>0)
        {
            int rem=binaryNum%10;
            decimalNum=decimalNum+(rem*pow);
            binaryNum=binaryNum/10;
            pow=pow*2;
        }
        return decimalNum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binaryNum=sc.nextInt();
        System.out.println(convertion(binaryNum));

    }
}
