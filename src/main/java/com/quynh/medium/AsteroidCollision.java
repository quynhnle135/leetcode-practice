package com.quynh.medium;

import java.util.*;

public class AsteroidCollision {
    // positive: right, negative: left
    // collision right left next to each other
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else if(stack.peek() == -asteroids[i]) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] asteroids1 = {5, 10, -5};
//        int[] res1 = asteroidCollision(asteroids1);
//        for (int i : res1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        int[] asteroids2 = {5, 10, -5, -2, -12};
        int[] res2 = asteroidCollision(asteroids2);
        for (int i : res2) {
            System.out.print(i + " ");
        }

    }
}
