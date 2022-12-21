package com.quynh.string;

public class LongestCommonPrefix {
    public static String findCommonPrefix(String[] words) {
        if (words.length == 0) {
            return "";
        }
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
//        String[] words = {"flowers", "flow", "flight"};
//        System.out.println(findCommonPrefix(words));
        String s1 = "flowers";
        String s2 = "flow";
        String s3 = "flight";
        System.out.println(s2.indexOf(s1));
        System.out.println(s3.indexOf(s1));
    }
}
