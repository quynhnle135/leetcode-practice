package com.quynh.array;

import java.util.HashMap;
import java.util.Map;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] flowerbed = {1, 0, 0, 0, 1};
        for (int i = 0; i < flowerbed.length; i++) {
            map.put(flowerbed[i], i);
        }
        System.out.println(map);

    }
    // 0 1 0 1 0 1 -> false
    // 0 0 0 0 0 0 -> true
    // 1 0 1 0 0 0 1, n = 2 -> false
}
