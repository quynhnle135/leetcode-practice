package com.quynh.array;

public class Search2DArrayMatrix {
    // naive approach
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        // traverse each row in the matrix
//        for (int i = 0; i < matrix.length; i++) {
//            // traverse each column in current row
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == target) return true;
//            }
//        }
//        return false;
//    }

    // combined with binary search
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        /* traverse each row in the matrix
//        and search for target with Binary Search */
//        for (int i = 0; i < matrix.length; i++) {
//            if (binarySearch(matrix[i], target)) return true;
//        }
//        return false;
//    }
//
//    public static boolean binarySearch(int[] arr, int target) {
//        int l = 0;
//        int r = arr.length - 1;
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            if (arr[mid] == target) {
//                return true;
//            }
//            else if (target < arr[mid]) {
//                r = mid;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return false;
//    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            }
            if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 100));
        System.out.println(searchMatrix(matrix, 20));
    }
}
