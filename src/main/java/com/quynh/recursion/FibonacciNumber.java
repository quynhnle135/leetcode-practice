package com.quynh.recursion;

public class FibonacciNumber {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1)  + fib(n - 2);
    }

    public static int fibIterative(int n) {
        int fib_1 = 0;
        int fib_2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = fib_1 + fib_2;
            fib_1 = fib_2;
            fib_2 = fib;
        }
        return fib;
    }
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55
        System.out.println(fib(8)); // 21
        System.out.println(fibIterative(8));
        System.out.println(fib(5)); // 5
        System.out.println(fibIterative(5));
        System.out.println(fib(2)); // 1
        System.out.println(fibIterative(2));
    }
}
