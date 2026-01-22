package AnagramString;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting_approach
{
    static boolean isAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length()) return false;

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (isAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
        sc.close();
    }
}
