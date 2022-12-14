package com.quynh.slidingwindow;

import java.util.*;

public class ContainDuplicateII {
    // 1 0 1 1, k = 1
    // true
//    public static boolean containDuplicate(int[] arr, int k) {
//        int windowStart = 0;
//        Queue<Integer> seenNumber = new LinkedList<>();
//        // add first number to queue
//        seenNumber.add(arr[windowStart]);
//        for (int windowEnd = 1; windowEnd < arr.length; windowEnd++) {
//            if (windowEnd - windowStart > k) {
//                windowStart++;
//                seenNumber.remove();
//            }
//            if (!seenNumber.contains(arr[windowEnd])) {
//                seenNumber.add(arr[windowEnd]);
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean containDuplicate(int[] nums, int k) {
        int start = 0;
        Set<Integer> seenNumbers = new HashSet<>();
        seenNumbers.add(nums[start]);
        for (int end = 1; end < nums.length; end++) {
            if (end - start <=k && !seenNumbers.contains(nums[end])) {
                seenNumbers.add(nums[end]);
            }
             else if (end - start > k) {
                seenNumbers.remove(nums[start]);
                start++;
            } else {
                 return true;
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
