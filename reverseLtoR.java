import java.util.Scanner;

public class reverseLtoR {
    static void reverseLR(int arr[],int left,int right)
    {
        if(left>=right) return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseLR(arr, left+1, right-1);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
            int left=1;
            int right=n-2;
           reverseLR(arr,left,right);
        for(int i=0;i<n;i++)
        {
            System.out.print( arr[i]+ " ");
        }
        sc.close();
    }
    
}
