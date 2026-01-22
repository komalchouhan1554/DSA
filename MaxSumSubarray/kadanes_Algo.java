package MaxSumSubarray;
import java.util.*;
public class kadanes_Algo {

    static int Max_sum_subarray(int arr[],int n)
    {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int end=0;
        int newStart=0;
        for (int i=0;i<n;i++)
        {
            sum=arr[i]+sum;
            if(sum>maxSum)
           {
            maxSum=sum;
            start=newStart;
            end=i;
           }
            if (sum<0)
            {
                sum=0;
                newStart=i+1;
            }
        
        }
        System.out.print("Max Subarray: ");
           for(int k=start;k<=end;k++)
           {
            System.out.print(arr[k]+" ");
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
