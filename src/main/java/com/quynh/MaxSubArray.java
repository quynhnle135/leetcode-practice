package com.quynh;

public class MaxSubArray {
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

    // Two nested loop
//    public static int findMaxSum(int[] arr) {
//         int maxSum = Integer.MIN_VALUE;
//         int curSum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             curSum =
//             for (int j = 0; j < arr.length; j++) {
//
//                 maxSum = Math.max(maxSum, curSum);
//             }
//         }
//         return maxSum;
//    }
    // michal's solution
    public static int maxSubArray(int[] arr)
    {
        int max = 0;
        int maxElement = 0;

        for(int i = 0; i < arr.length; i++){
            int sumNElement = 0;
            maxElement = Math.max(arr[i], maxElement);
            for(int j = i+1; j < arr.length; j++){
                sumNElement += arr[j];
                int sumElement = arr[i] + sumNElement;
                max = Math.max(sumElement, max);
            }
        }
        return Math.max(max, maxElement);
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr1 = {10, -1, -2, -3};
        System.out.println(findMaxSubArray(arr1));
        System.out.println(maxSubArray(arr1));
    }
}
