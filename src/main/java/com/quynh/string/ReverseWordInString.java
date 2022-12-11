package com.quynh.string;

import java.util.ArrayList;
import java.util.Arrays;
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
        for (int i = 0; i < stack.size(); i++) {
            String current = stack.pop();
            if (current != " ") {
                result += current + " ";
            }
        }
        return result.trim();
    }

    public static String reverseWordInString(String s) {
        String[] words = s.split("\\s");
        String result = "";
        String space = " ";
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].equalsIgnoreCase(space)) {
                continue;
            }
            System.out.println(words[i]);
            result += words[i] + " ";
        }
        return result.trim();
    }


    public static void main(String[] args) {
        String s1 = "the sky is blue";
//        System.out.println(reverseWordInString(s1));
//        System.out.println(reverse(s1));
        String s2 = "a good   example";
        System.out.println(reverseWordInString(s2));
//        System.out.println(reverse(s2));

//        String s = "hello";
//        String res = "";
//        for (int i = 0; i < s.length(); i++) {
//            res += s.charAt(i);
//        }
//        System.out.println(res);
        // learned about split()
//        s2.trim();
//        String[] s = s2.split(" ");
//        for (String str : s) {
//            System.out.println(str);
//        }

//        String s3 = "  hello anh bin ";
//        System.out.println(s3.trim());
    }
}
