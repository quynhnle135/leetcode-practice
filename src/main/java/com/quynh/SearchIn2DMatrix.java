package com.quynh;

public class SearchIn2DMatrix {
    public static boolean search(int[][] arr, int target) {
        // Naive approach - using nested loop
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;

        // Binary search 0(logN)

//        int i = 0;
//        int j = arr[0].length - 1;
//        while (i < arr.length && j >= 0) {
//            if (arr[i][j] == target) {
//                return true;
//            }
//            if (target < arr[i][j]) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//        return false;

        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr[i], target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (target < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(search(matrix, 20));
        int[] arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearch(arr, 2));
    }
}
