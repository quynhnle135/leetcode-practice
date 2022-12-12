package com.quynh.array;

public class MaximumSubArray {
    // naive approach
    public static int findMaxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                max = Math.max(currentSum, max);
            }
        }
        return max;
    }

    public static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSum(arr1));
        System.out.println(maxSubArray(arr1));

        int[] arr2 = {5,4,-1,7,8};
        System.out.println(findMaxSum(arr2));
        System.out.println(maxSubArray(arr2));
    }
}
