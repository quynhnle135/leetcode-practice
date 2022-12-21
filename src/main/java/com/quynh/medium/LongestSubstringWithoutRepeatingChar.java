package com.quynh.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
    // sliding window approach
    public static int findLongestSubstring(String s) {
        int start = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char r = s.charAt(end);
            map.put(r, map.getOrDefault(r, 0) + 1);
            while (map.get(r) > 1) {
                char l = s.charAt(start);
                map.put(l, map.get(l) - 1);
                start++;
            }
            res = Math.max(res, end - start + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findLongestSubstring("abcabcbb")); // 3
        System.out.println(findLongestSubstring("abcdefg")); // 7
        System.out.println(findLongestSubstring("aaaaaaa")); // 1
        System.out.println(findLongestSubstring("aab")); //2
    }
}
// Input: s = "abcabcbb"
// Output: 3