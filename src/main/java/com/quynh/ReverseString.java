package com.quynh;

public class ReverseString {
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println("Before reversing: ");
        for (char c : s) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("After reversing: ");
        reverseString(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}
