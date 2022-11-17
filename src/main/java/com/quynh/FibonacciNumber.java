package com.quynh;

public class FibonacciNumber {
    public static int findFib(int n) {
        if (n < 2) return n;
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static int findFibRec(int n) {
        if (n < 2) return n;
        return findFibRec(n - 1) + findFibRec(n - 2);
    }

    // 0 1 1 2 3 5 8 13 21 34...
    public static void main(String[] args) {
        System.out.println(findFib(6)); // 8
        System.out.println(findFibRec(6));
        System.out.println(findFib(1)); // 1
        System.out.println(findFibRec(1));
        System.out.println(findFib(8)); // 21
        System.out.println(findFibRec(8));
    }
}
