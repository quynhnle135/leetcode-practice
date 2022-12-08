package com.quynh.string;

public class ReverseWord {
    public static String reverseWord(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Hello"));
    }
}
