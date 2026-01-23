package TwoSum;

import java.util.HashSet;
import java.util.Scanner;

public class Using_HashSet {
        static boolean twosum(int arr[], int target, int n) {

            HashSet<Integer> h=new HashSet<>();
            for (int x : arr) {
              if( h.contains(target-x))
                {System.out.println(x+" "+(target-x));
                return true;}
            h.add(x);  
            }
            return false;
        }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter Tagrt:");
        int target = sc.nextInt();

        boolean z = twosum(arr, target, n);
        if (z == false) {
            System.out.println("Key Not found!");
        } else {
            System.out.println("Key found :" + z);
        }
        sc.close();
    }

}
