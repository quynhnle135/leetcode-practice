package com.quynh.string;

import java.util.*;

public class CommonCharacter {

    public static List<String> findCommonCharacter(String[] words) {
        List<String> result = new ArrayList<>();
        int[] min_frequencies = new int[26];
        Arrays.fill(min_frequencies, Integer.MAX_VALUE);
        for (String current_string : words) {
            int[] char_frequency = new int[26];
            for (char c : current_string.toCharArray()) {
                char_frequency[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                min_frequencies[i] = Math.min(min_frequencies[i], char_frequency[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (min_frequencies[i] > 0) {
                result.add("" + (char)(i + 'a'));
                min_frequencies[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(findCommonCharacter(words));
    }
}
