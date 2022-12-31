package com.quynh.array;

import java.util.Arrays;
import java.util.Stack;

public class RotateArray {
    // first approach: using another array
    public static void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 1 2 3 4
        rotateArray(nums, 4);

        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotateArray(nums1, k1);
        for (int n : nums1) {
            System.out.print(n + " ");
        }
        System.out.println();

    }
}
