import java.util.Scanner;

 class ReverseNumberLeetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        int num=sol.reverse(n);
        System.out.println(num);
        sc.close();
    }
}

class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);  // Original number ka absolute value nikala
        
        int rev = 0;  // Reversed number
        
        while (num != 0) {
            int ld = num % 10;  // Last digit nikala
            
            // Overflow check
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }
            
            rev = rev * 10 + ld;  // Reverse mein digit ko add kiya
            num = num / 10;  // Last digit hata diya, next iteration ke liye
        }
        
        return (x < 0) ? (-rev) : rev;  // Original number ke sign ke hisaab se result diya
    }
}

//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

/*Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21 */


/*Intuition
just like reversing of an integer we have to solve the question in addition with the overflow and underflow condition 🤧

Approach
ENGLISH MEIN:
1.Initialize the reversed number (rev) to 0.
2.Loop through each digit of the input number.
For each digit, check if adding it to the reversed number will cause an overflow.
3.If an overflow is detected, return 0.
Otherwise, update the reversed number by multiplying it by 10 and adding the current digit.
4.Continue this process until all digits are processed.
5.Return the reversed number with the appropriate sign.
HINDI MEIN:
*********1.Reversed number (rev) ko 0 se shuru karo:
Jaise hi humein ek number ka reverse nikalna hai, hum shuruwat mein reverse number ko 0 se initialize karte hain.

2.Har digit ko loop ke dwara check karo:
Har digit ko dekho, iske liye hum loop ka istemal karte hain.

3.Har digit ko reversed number mein add karne se overflow hoga ya nahi, yeh check karo:
Har bar jab hum ek digit ko reversed number mein add karte hain, tab yeh dekhte hain ki kya yeh next iteration mein overflow karega ya nahi.

4.Agar overflow hota hai, toh 0 return karo:
Agar overflow detect hota hai, matlab agar reversed number bahut bada ho gaya hai, toh hum 0 return karte hain.

5.Warna, reversed number ko 10 se multiply karke current digit ko add karo aur process ko continue karo:
Agar overflow nahi hua, toh hum reversed number ko 10 se multiply karte hain aur current digit ko add karte hain. Fir hum next digit ke liye is process ko continue karte hain.

6.Yeh process tab tak chalti hai jab tak saare digits process ho jaye:
Hum yeh process har digit ke liye repeat karte hain jab tak saare digits process ho jaye.

7.Reversed number ko appropriate sign ke sath return karo:
Ant mein, hum reversed number ko input number ke sign ke hisaab se return karte hain*.*****

Complexity
-Time Complexity: O(log(x))
-Space Complexity: O(1)

 */
