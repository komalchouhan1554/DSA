package MoveAllZerosToEnd;

import java.util.Scanner;

public class TwoPointer_approach {

    static void moveAllZerosToEnd(int arr[]) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx] = arr[i];
                idx++;
            }

        }
        while (idx < arr.length) {
            arr[idx++] = 0;
        }
        for (int i : arr)
            System.out.print(i + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        moveAllZerosToEnd(arr);
        System.out.println();
        sc.close();
    }

}
