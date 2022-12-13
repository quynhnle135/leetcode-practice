package com.quynh.dynamicprogramming;

public class Knapsack {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapSack(int w, int[] weight, int[] value, int n) {
        // base case
        if (n == 0 || w == 0) {
            return 0;
        }

        // If weight of the last item is
        // more than the capacity of knapsack -> not include
        if (weight[n - 1] > w) {
            return knapSack(w, weight, value, n - 1);
        }
        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else {
            return max(value[n - 1] + knapSack(w - weight[n - 1], weight, value, n - 1),
                    knapSack(w, weight, value, n - 1));
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int w = 10;
        int[] value = new int[] {50, 40, 70, 90};
        int[] weight = new int[] {1, 3, 5, 6};

        System.out.println(knapSack(w, weight, value, n));
    }
}
