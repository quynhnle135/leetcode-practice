package com.quynh;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i) {
                return new int[] {i, map.get(target - arr[i])};
            } else {
                continue;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] res = findSum(arr, 6);
        for (int n : res) {
            System.out.println(n);
        }
    }
}
