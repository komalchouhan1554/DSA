package ReverseArray;

import java.util.Scanner;

public class recursive_Approach {
static void reverseRec(int[] arr, int left, int right) {
    if (left >= right) return;
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverseRec(arr, left + 1, right - 1);
}

    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
            int left=0;
            int right=arr.length-1;
           reverseRec(arr,left,right);
        for(int i=0;i<n;i++)
        {
            System.out.print( arr[i]+ " ");
        }
    }
}
