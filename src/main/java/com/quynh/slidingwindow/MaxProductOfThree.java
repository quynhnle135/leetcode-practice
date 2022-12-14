package com.quynh.slidingwindow;

import java.util.Arrays;

public class MaxProductOfThree {
//    public static int findMaxProduct(int[] nums) {
//        if (nums.length == 3) {
//            return nums[0] * nums[1] * nums[2];
//        }
//        int start = 0;
//        int maxProduct = Integer.MIN_VALUE;
//        int curProduct = nums[0];
//        for (int end = 1; end < nums.length; end++) {
//            if (end > 2) {
//                if (nums[start] == 0) {
//                    start++;
//                }
//                curProduct /= nums[start];
//                start++;
//            }
//            curProduct *= nums[end];
//            if (curProduct > maxProduct) {
//                maxProduct = curProduct;
//            }
//
//        }
//        return maxProduct;
//    }

    public static int findMaxProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }

            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 2, 7, 9}; // 126
        System.out.println(findMaxProduct(nums1));
        int[] nums2 = {1, 2, 3}; // 6
        System.out.println(findMaxProduct(nums2));
        int[] nums3 = {-1, -2, -3}; // - 6
        System.out.println(findMaxProduct(nums3));
        int[] nums4 = {1, 5, 0, 7, 9, 3, 2};
        System.out.println(findMaxProduct(nums4)); // 189
        int[] nums5 = {-100,-98,-1,2,3,4};
        System.out.println(findMaxProduct(nums5));
    }
}
