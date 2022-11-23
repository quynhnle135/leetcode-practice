package com.quynh.binarysearch;

public class SearchInsertPosition {
    public static int insertPosition(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(insertPosition(arr, 7)); // 6
        System.out.println(insertPosition(arr, 3)); // 2
    }
}
