package com.quynh.slidingwindow;

import java.util.*;

public class ContainDuplicateII {

    public static boolean containDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            } else {
                    map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containDuplicate(nums, k)); // true
        int[] nums1 = {1, 0, 1, 1};
        int k1 = 1;
        System.out.println(containDuplicate(nums1, k1)); // true
        int[] nums2 = {1,2,3,1,2,3};
        int k2 = 2;
        System.out.println(containDuplicate(nums2, k2)); // false
        int[] nums3 = {0,1,2,3,2,5};
        int k3 = 3;
        System.out.println(containDuplicate(nums3, k3)); //true
    }
}
