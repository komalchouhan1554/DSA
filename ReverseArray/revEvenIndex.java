package ReverseArray;
import java.util.Scanner;

public class revEvenIndex {
    static void reverseEven(int arr[])
    {
        int n=arr.length;
        int left=0;
        int right=(n%2==0)?n-2:n-1;
    
        while(left<right)
        {
            
             int temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
            
             right=right-2;
             left=left+2;

        }
    }
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    
           reverseEven(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print( arr[i]+ " ");
        }
        sc.close();
    }
}
