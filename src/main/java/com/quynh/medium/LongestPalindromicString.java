package com.quynh.medium;

public class LongestPalindromicString {
    public static String findLongestPalindrome(String s) {
        int maxLength = -1;
        String result = String.valueOf(s.charAt(0));
        for (int p1 = 0; p1 < s.length(); p1++) {
            char curChar = s.charAt(p1);
            for (int p2 = p1 + 1; p2 < s.length(); p2++) {
                if (curChar == s.charAt(p2)) {
                    boolean isPalindrome = checkPalindrome(s.substring(p1, p2 + 1));
                    if (isPalindrome) {
                        int curLength = p2 - p1 + 1;
                        if (curLength > maxLength) {
                            maxLength = curLength;
                            result = s.substring(p1, p2 + 1);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static boolean checkPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            } else {
                p1++;
                p2--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findLongestPalindrome("babad"));
        String s = "babad";
        System.out.println(findLongestPalindrome("ac")); // a
        System.out.println(findLongestPalindrome("abcd")); // a
    }
}
