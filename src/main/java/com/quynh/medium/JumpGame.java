package com.quynh.medium;

public class JumpGame {
    // most optimal approach
    public static boolean canJump(int[] arr) {
        int currentBack = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i + arr[i] >= currentBack) {
                currentBack = i;
            }
        }
        return currentBack == 0;
    }

    public static boolean ableToJump(int[] arr) {
        if (arr[0] >= arr.length - 1) {
            return true;
        }
        if (arr[0] == 0) {
            return false;
        }
        int i = 0;
        while (i <= arr.length - 2) {
            if (arr[i] == 0) return false;
            if (arr[i] + i >= arr.length - 1) {
                return true;
            } else {
                i = arr[i] + i;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
//        System.out.println(canJump(arr));
        System.out.println(ableToJump(arr));
    }
}
