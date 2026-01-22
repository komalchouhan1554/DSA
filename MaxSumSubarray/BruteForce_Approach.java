package MaxSumSubarray;

import java.util.Scanner;

public class BruteForce_Approach {

    static int Max_sum_subarray(int arr[],int n)
    {
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
            for(int j=i;j<n;j++)
        {
           int  sum=0;
           for (int k=i;k<=j;k++) {
            sum=arr[k]+sum;
           }
           maxSum=Math.max(sum,maxSum);
        }
return maxSum;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Max_sum_subarray(arr,n));
        sc.close();
    }
}
