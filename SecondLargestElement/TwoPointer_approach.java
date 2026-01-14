package SecondLargestElement;

import java.util.Scanner;

class TwoPointer_approach
{

    static int SecondLargest(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        int SecondL=Integer.MIN_VALUE;
        if (arr.length<2) return -1;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                SecondL=largest;
                largest=arr[i];
            }
            else if(arr[i]>SecondL && arr[i]<largest)
            {
                SecondL=arr[i];
            }
        }
        return SecondL==Integer.MIN_VALUE?-1:SecondL;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int s = SecondLargest(arr);
        System.out.println(s);
        sc.close();
}
}
