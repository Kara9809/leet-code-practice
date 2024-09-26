package org.exercises.ex2_palindrome;

public class Main {
    public static void main(String[] args) {
        PalindromeEx2 solution2 = new PalindromeEx2();
        int num1 = 1221;
        int num2 = -121;
        System.out.println(num1 + " is Palindrome: " + solution2.isPalindrome(num1));
        System.out.println(num2 + " is Palindrome: " + solution2.isPalindrome(num2));
    }
}
