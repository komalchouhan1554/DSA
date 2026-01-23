package Count_Frequency_of_Elements;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Using_HashMap {

    static void countFrequency(int arr[],int n)
    {
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer>entry:map.entrySet())
            {
                System.out.println(entry.getKey() +"-> "+entry.getValue());
            }                               
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countFrequency(arr, n);
        sc.close();
    }
}
