package com.quynh;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            // add first value to current row
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j - 1));
            }
            // add last value to current row
            currentRow.add(1);
            // add current row to triangle
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generateTriangle(5));
        System.out.println(generateTriangle(6));
    }
}
