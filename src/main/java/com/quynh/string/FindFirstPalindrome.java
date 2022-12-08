package com.quynh.string;

public class FindFirstPalindrome {
    public static boolean isPalindrome(String s) {
        s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))  {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public static String findFirstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ada"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("abcdef"));
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(findFirstPalindrome(words));
    }
}
