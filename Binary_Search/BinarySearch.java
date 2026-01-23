package Binary_Search;

import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int arr[], int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
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

        int z = binarySearch(arr, target);
        if (z==-1) {
            System.out.println("Key Not found!");
        } else {
            System.out.println("Key found at:"+z);
        }
        
        sc.close();
    }
}
