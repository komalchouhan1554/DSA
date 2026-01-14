package SecondLargestElement;

import java.util.Scanner;

public class SecondLargestEven {
    static int SecondLargestEvenNum(int arr[])
        {
        if (arr.length<2) return -1;
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        int evenCount = 0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0){
                evenCount++;
            if (arr[i]>largest)
            {
                SecondLargest=largest;
                largest=arr[i];   
            }
            else if(arr[i]>SecondLargest && arr[i]<largest )
            {
                SecondLargest=arr[i];
            }
            }

            }

            if (evenCount < 2) return -1;
            return SecondLargest;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int s = SecondLargestEvenNum(arr);
        System.out.println(s);
        sc.close();
}
    
}
