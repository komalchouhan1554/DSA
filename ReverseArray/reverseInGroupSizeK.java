package ReverseArray;
import java.util.Scanner;

public class reverseInGroupSizeK {

    static void reverseInGroup(int n,int k,int arr[] )
    {
        for(int i=0;i<n;i=i+k)
        {
        int left=i;
        int right=Math.min(left+k-1, n-1);

        while(left<right)
       {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
       }
    }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        reverseInGroup(n, k, arr);
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
