package ReverseString;

import java.util.Scanner;

public class TwoPointer_Approach {
    static String reverseString(String s) {
        if (s.length() == 1)
            return s;

        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j)// swap
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
        sc.close();
    }
}
