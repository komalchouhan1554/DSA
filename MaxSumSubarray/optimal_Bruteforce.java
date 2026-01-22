package MaxSumSubarray;

import java.util.Scanner;

public class optimal_Bruteforce {

    static int Max_sum_subarray(int arr[],int n)
    {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        { int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=arr[j]+sum;
            }

            maxSum=Math.max(maxSum, sum);
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
