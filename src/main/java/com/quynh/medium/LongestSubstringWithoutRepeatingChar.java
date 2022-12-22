package com.quynh.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
    // sliding window approach
    public static int findLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            char right = s.charAt(r);
            map.put(right, map.getOrDefault(right, 0) + 1);

            while(map.get(right) > 1) {
                char left = s.charAt(l);
                map.put(left, map.get(left) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
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