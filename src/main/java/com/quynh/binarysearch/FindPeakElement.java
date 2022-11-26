package com.quynh.binarysearch;

public class FindPeakElement {
    public static int findPeak(int[] nums) {
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i - 1] > arr[i]) {
//                return i - 1;
//            }
//        }
//        return arr.length - 1;

        // using binary search
        int l = 0; int r = nums.length - 1;
        while(l < r) {
            int mid = l + (r-l)/2;
            if(nums[mid] < nums[mid+1]) { //ascending
                l = mid+1;
            }
            if(nums[mid] > nums[mid+1]) { //descending
                r = mid;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findPeak(arr)); // 4
        int[] arr1 = {1};
        System.out.println(findPeak(arr1));
        int[] arr2 = {1,2,3,6,5,4};
    }
}
