package AnagramString;

import java.util.Scanner;

public class FrequencyCount_Approach {
static boolean isAnagram(String s1, String s2)
{
    // Step 1: Length check
    if (s1.length() != s2.length())
        return false;

    // Step 2: Frequency array
    int[] freq = new int[256];

    // Step 3: Count characters
    for (int i = 0; i < s1.length(); i++)
    {
        freq[s1.charAt(i)]++; // increase for s1
        freq[s2.charAt(i)]--; // decrease for s2
    }

    // Step 4: Check frequency array
    for (int c : freq)
    {
        if (c != 0)
            return false;
    }

    return true;
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
