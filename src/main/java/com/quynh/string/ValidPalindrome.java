package com.quynh.string;

import java.util.Stack;

public class ValidPalindrome {
    public static boolean isValidPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            if (!Character.isLetterOrDigit(lChar)) {
                l++;
            }
            else if (!Character.isLetterOrDigit(rChar)) {
                r--;
            }
            else {
                if (lChar != rChar) return false;
                else {
                    l++;
                    r--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
//        String s = "A man, a plan, a canal: Panama";
//        s.toLowerCase();
//        System.out.println(s);
//        for (char c : s.toCharArray()) {
//            System.out.println("Is " + c + " is letter? " + Character.isLetter(c));
//        }
    }
}
