package com.quynh.binarysearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr1, 7));
        System.out.println(binarySearch(arr1, 10));
    }
}
