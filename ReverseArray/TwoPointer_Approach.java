package ReverseArray;

import java.util.Scanner;

//use when in-place,0(1), no extra space, best approch is mentioned

public class TwoPointer_Approach {

static void reverseArray(int n,int arr[])
{
 int left=0;
 int right=arr.length-1;
 while (left<right) 
{
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;

    left++;
    right--;
 }
}

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
 
    reverseArray(n,arr);

    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+ " ");
    }
        
    }
    
}
