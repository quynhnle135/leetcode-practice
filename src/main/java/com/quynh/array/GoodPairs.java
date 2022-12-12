package com.quynh.array;

public class GoodPairs {
    // naive approach
    public static int goodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

//    public static int findGoodPairs(int[] nums) {
//        int i = 0;
//        int j = 1;
//        int count = 0;
//        while (i < nums.length) {
//            if (j == nums.length) {
//                i++;
//                j = i + 1;
//            }
//            if (nums[i] == nums[j] && j < nums.) {
//                count++;
//                j++;
//            } else {
//                j++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(goodPairs(nums));
//        System.out.println(findGoodPairs(nums));

        int[] nums1 = {1, 1, 1, 1};
        System.out.println(goodPairs(nums1));
//        System.out.println(findGoodPairs(nums1));

    }
}
