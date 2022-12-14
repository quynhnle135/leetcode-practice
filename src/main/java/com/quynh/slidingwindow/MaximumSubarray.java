package com.quynh.slidingwindow;

public class MaximumSubarray {
    public static int findMaxSub(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                curSum += arr[j];
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
            }
            curSum = 0;
        }
        return maxSum;
    }

    public static int findMaxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSub(arr1));

        int[] arr2 = {5,4,-1,7,8};
        System.out.println(findMaxSub(arr2));
    }
}
