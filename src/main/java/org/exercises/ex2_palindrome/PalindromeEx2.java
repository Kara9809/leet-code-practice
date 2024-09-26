package org.exercises.ex2_palindrome;
//Given an integer x, return true if x is a palindrome, and false otherwise.
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

public class PalindromeEx2 {
    public boolean isPalindrome(int x){
        if (x<0 || x%10==0 && x!=0){
            return false;
        }
        int reversedHalf = 0;
        while (x>reversedHalf){
            reversedHalf= reversedHalf*10+x%10;
            x/=10;
        }
        return x==reversedHalf || x==reversedHalf/10;
    }
}
