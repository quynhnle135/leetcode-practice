package com.quynh.recursion;

public class Palindrome {
    public static boolean checkPalindrome(int[] n) {
        int leftPointer = 0;
        int rightPointer = n.length - 1;

        while (leftPointer < rightPointer) {
            if (n[leftPointer] != n[rightPointer]) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public static boolean isPalindrome(int[] arr) {
        return checkPalindromeRecursively(arr, 0, arr.length - 1);
    }

    public static boolean checkPalindromeRecursively(int[] arr, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (arr[left] != arr[right]) {
            return false;
        }

        return checkPalindromeRecursively(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1,2,3,4};
        System.out.println(checkPalindrome(arr1)); // true
        System.out.println(isPalindrome(arr1));
        System.out.println(checkPalindrome(arr2)); // false
        System.out.println(isPalindrome(arr2));
    }
}
