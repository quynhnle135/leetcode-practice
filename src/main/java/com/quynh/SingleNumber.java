package com.quynh;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    // HashMap solution
    public static int findSingleNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1};
        System.out.println(findSingleNumber(arr1));
        int[] arr2 = {4,1,2,1,2};
        System.out.println(findSingleNumber(arr2));
        int[] arr3 = {1};
        System.out.println(findSingleNumber(arr3));
    }
}
