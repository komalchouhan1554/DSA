package MoveAllZerosToEnd;

import java.util.Scanner;


public class UsingExtraArray {

     static void moveAllZerosToEnd(int arr[])
    {
        int temp[]=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp[idx++]=arr[i];
            }
        }
        for (int i : temp) {
            System.out.print(i);
        }
        

    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        moveAllZerosToEnd(arr);
        System.out.println();
        sc.close();
}
}
