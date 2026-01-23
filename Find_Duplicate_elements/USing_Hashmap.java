package Find_Duplicate_elements;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class USing_Hashmap {

    static void findFrequency(int arr[], int n)
    {
        LinkedHashMap <Integer,Integer> map=new LinkedHashMap<>();
 boolean found = false;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);     
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()>1)
           {   System.out.println(entry.getKey()+" ");
            found=true;}
            
        }
        if(!found)
        {
            System.out.println("-1");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findFrequency(arr, n);
        sc.close();
}
}
