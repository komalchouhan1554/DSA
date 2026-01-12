package ReverseArray;

import java.util.Scanner;

//use whaen you cannot make changes in original array;

public class ExtraArray_Approach {

    static int[] reverseArray(int n,int arr[])
    {
        int A[]=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=arr[n-1-i];
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int A[]=reverseArray(n,arr);
        for(int i=0;i<n;i++)
        {
            System.out.print( A[i]+ " ");
        }
    }
    
}
