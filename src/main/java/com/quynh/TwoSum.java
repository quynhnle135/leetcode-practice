package com.quynh;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // naive approach
    public static int[] findSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    // Map approach
    public static int[] findSumMap(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            } else {
                map.put(arr[i], i);
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i) {
//                return new int[] {i, map.get(target - arr[i])};
//            }
//        }
        return new int[] {-1 , -1};
    }


    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4};
        int[] res1 = findSum(nums1, 6);
        int[] res2 = findSumMap(nums1, 6);
        for (int n : res1) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : res2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
