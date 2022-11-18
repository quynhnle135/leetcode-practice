package com.quynh;

public class RemoveElement {
    public static int removeElement(int[] arr, int target) {
        int startIndex = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[startIndex++] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,2,2,3};
        int[] arr2 = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr1, 3)); // 2
        System.out.println(removeElement(arr2, 2)); // 5
    }
}
