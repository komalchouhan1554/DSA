import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("---------------------------");
        Solution s = new Solution();
        s.reverseArray(arr, 0);

        System.out.println(Arrays.toString(arr));
        sc.close();

    }

}

class Solution {

    public int[] reverseArray(int[] arr, int i) {
        if (i >= arr.length / 2)
            return arr;

        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseArray(arr, i + 1);
        return arr;
    }
}