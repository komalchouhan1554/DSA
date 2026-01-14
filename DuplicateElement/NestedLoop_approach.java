package DuplicateElement;

import java.util.Scanner;

class NestedLoop_approach {

    static void Duplicate(int array[], int n) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {

                    System.out.print(array[i] + " ");
                    found = true;
                }
            }
        }

        if (found == false) {
            System.out.println(-1);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Duplicate(array, n);

        sc.close();
    }
}