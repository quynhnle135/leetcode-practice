package com.quynh.array;

public class ProductOfArrayExceptSelf {
    public static int[] findProduct(int[] nums) {
        int totalProduct = 1;
        for (int n : nums) {
            totalProduct *= n;
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = totalProduct / nums[i];
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
