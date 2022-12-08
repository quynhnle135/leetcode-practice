package com.quynh.string;

public class ReverseStringII {
    public static String reverseString(String s, int k) {
        String reversed = "";
        String result = "";
        for (int i = k - 1; i >=0; i--) {
           reversed += s.charAt(i);
        }
        result += reversed;
        for (int i = k; i < s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("abcdefg", 2));
        System.out.println(reverseString("abcd", 2));
    }

}
