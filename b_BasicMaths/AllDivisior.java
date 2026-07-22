import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class AllDivisior{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        System.out.println(Arrays.toString(sol.divisors(n)));
        sc.close();
    }
}
class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
        
            if(i!=n/i)
            {
                list.add(n/i);
            }
            }
        }
        Collections.sort(list);
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
return result;
    }
}