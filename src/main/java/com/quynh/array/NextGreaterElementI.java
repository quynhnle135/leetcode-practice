package com.quynh.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] findGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterElement = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterElement.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreaterElement.getOrDefault(nums1[i], -1);
        }
        return nums1;

    }
    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] res = findGreaterElement(nums1, nums2);
        for (int n : res) {
            System.out.print(n + " "); // -1 3 -1
        }

    }
}
