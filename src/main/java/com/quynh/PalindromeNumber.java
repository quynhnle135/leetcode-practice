package com.quynh;

public class PalindromeNumber {
    public static boolean checkPalindrome(int n) {
        if (n < 0) return false;
        int temp = n;
        int reversedNum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }
        if (reversedNum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(-121)); // false
        System.out.println(checkPalindrome(121)); // true
        System.out.println(checkPalindrome(999)); // true
        System.out.println(checkPalindrome(9)); // true
        System.out.println(checkPalindrome(1234)); // false
    }
}
