package com.quynh.slidingwindow;

public class MaximumProductArray {
    public static int findMaxProduct(int[] nums) {
        int min = nums[0], max = nums[0], ans = nums[0]; // 2
        for (int i = 1; i < nums.length; i++) {
            int temp = max; // 2
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]); // 6
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]); // 2
            if (max > ans) {
                ans = max; // 6
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int[] nums1 = {-3, -1, -1};
//        System.out.println(findMaxProduct(nums1)); // 3
//        int[] nums2 = {2, 3, -2, 4};
//        System.out.println(findMaxProduct(nums2)); // 6
        int[] nums3 = {2, 3, -2, -4, 5};
        System.out.println(findMaxProduct(nums3)); // 240
     }
}
