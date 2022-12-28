package com.quynh.recursion;

public class ArraySum {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static int sumRecursive(int[] arr) {
        return findSum(arr, 0);
    }

    public static int findSum(int[] arr, int pos) {
        if (pos >= arr.length) {
            return 0;
        }

        int value = arr[pos];
        return findSum(arr, pos + 1) + value;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, -7};
        System.out.println(sum(arr1)); // 6
        System.out.println(sumRecursive(arr1));
        System.out.println(sum(arr2)); // -1
        System.out.println(sumRecursive(arr2));
    }
}
