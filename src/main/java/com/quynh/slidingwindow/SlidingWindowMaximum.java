package com.quynh.slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {

    public static Deque<Integer> slidingWindowMax(List<Integer> nums, int k) {
        Deque<Integer> result = new ArrayDeque<>();
        Deque<Integer> window = new ArrayDeque<>();
        if (k > nums.size()) {
            k = nums.size();
        }
        if (nums.size() == 0) {
            return result;
        }

        for (int i = 0; i < k; i++) {
            while(!window.isEmpty() && nums.get(i) >= nums.get(window.peekLast())) {
                window.removeLast();
            }
            window.addLast(i);
        }
        // add first maximum value
        result.add(nums.get(window.peekFirst()));
        for (int i = k; i < nums.size(); i++) {
            while (!window.isEmpty() && nums.get(i) >= nums.get(window.peekLast())) {
                window.removeLast();
            }
            if (!window.isEmpty() && i - window.peekFirst() > k) {
                window.removeFirst();
            }
            window.addLast(i);
            result.add(nums.get(window.peek()));
        }
        return result;
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int resultIdx = 0;
        if (k > nums.length) {
            k = nums.length;
        }
        if (nums.length == 0) {
            return result;
        }

        Deque<Integer> window = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!window.isEmpty() && nums[i] >= nums[window.peekLast()]) {
                window.removeLast();
            }
            window.addLast(i);
        }
        nums[resultIdx] = nums[window.peekFirst()];
        resultIdx++;
        for (int i = k; i < nums.length; i++) {
            while (!window.isEmpty() && nums[i] >= nums[window.peekLast()]) {
                window.removeLast();
            }
            if (!window.isEmpty() && i - window.peekFirst() > k) {
                window.removeFirst();
            }
            window.addLast(i);
            result[resultIdx] = nums[window.peekFirst()];
            resultIdx++;
        }
        return result;
    }
    // input: nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
    // window:  4 5
    // result: 3 3 5 5
}
