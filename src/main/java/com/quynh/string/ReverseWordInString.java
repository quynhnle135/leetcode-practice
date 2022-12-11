package com.quynh.string;

import java.util.Stack;

public class ReverseWordInString {
    public static String reverse(String s) {
        String result = "";
        s = s.trim();
        String currentWord = "";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ' ') {
                stack.push(currentWord);
                currentWord = "";
            } else {
                currentWord += currentChar;
            }
        }
        stack.push(currentWord);
        while (!stack.isEmpty()) {
            result += stack.pop() + " ";
        }
        return result.trim();
    }

//    public static String reverseWordInString(String s) {
//        s = s.trim();
//        Stack<String> stack = new Stack<>();
//        int index = 0;
//        String currentWord = "";
//        while (index < s.length()) {
//            if (s.charAt(index) == ' ') {
//                stack.push(currentWord);
//                while (s.charAt(index) == ' ') {
//                    index++;
//                }
//            } else {
//                currentWord += s.charAt(index);
//                index++;
//            }
//        }
//        stack.push(currentWord);
//        String result = "";
//        while (!stack.isEmpty()) {
//            result += stack.pop() + " ";
//        }
//        return result.trim();
//    }


    public static void main(String[] args) {
        String s1 = "the sky is blue";
//        System.out.println(reverseWordInString(s1));
        System.out.println(reverse(s1));
        String s2 = "a good   example";
//        System.out.println(reverseWordInString(s2));
        System.out.println(reverse(s2));
    }
}
