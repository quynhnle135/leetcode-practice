package com.quynh.demo;

import java.util.ArrayList;
import java.util.List;

public class FindFactors {
    public static List<Integer> findFactors(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
//    public static boolean checkPrime(int n) {
//
//    }
    public static void main(String[] args) {
        System.out.println(findFactors(6));
    }
}
