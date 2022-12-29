package com.quynh.array;

import java.util.HashMap;
import java.util.Map;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int k) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= k;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0, 0};
        int n = 3;
        System.out.println(canPlaceFlowers(flowerbed, n));

    }
    // 0 1 0 1 0 1 -> false
    // 0 0 0 0 0 0 -> true
    // 1 0 1 0 0 0 1, n = 2 -> false
}
