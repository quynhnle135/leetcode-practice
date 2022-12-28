package com.quynh.medium;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
    public static int[] findNextGreaterElement(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] output_array = new int[n];
        Arrays.fill(output_array, -1);
        for (int i = 0; i < n * 2; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                output_array[stack.pop()] = nums[i % n];
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return output_array;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] nums1 = {1, 2, 3, 4, 3};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] res = findNextGreaterElement(nums);
        for (int n : res) {
            System.out.println(n);
        }

    }
}
