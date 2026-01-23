package TwoSum;

import java.util.Arrays;
import java.util.Scanner;

public class Two_pointer {

    static boolean twosum(int arr[], int target, int n) {
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                System.out.println(arr[start] + " " + arr[end]);
                return true;
            } else if (sum > target)
                end--;
            else
                start++;
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
            System.out.println("Key found at:" + z);
        }
        sc.close();
    }

}
