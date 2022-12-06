package com.quynh.array;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : arr1) {
            set1.add(n);
        }

        for (int n : arr2) {
            set2.add(n);
        }

        int[] res = new int[arr1.length];
        int index = 0;
        for (int n : set1) {
            if (set2.contains(n)) {
                res[index++] = n;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] res = intersection(num1, num2);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
