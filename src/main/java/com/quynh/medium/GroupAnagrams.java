package com.quynh.medium;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] currentString = str.toCharArray();
            Arrays.sort(currentString);
            String key = String.valueOf(currentString);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            } else {
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(words));
    }
}
