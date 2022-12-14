package com.quynh;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> generateTriangle(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        if (rowIndex == 0) {
            return firstRow;
        }
        triangle.add(firstRow);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for (int j = 1; j < i; j++) {
                curRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(generateTriangle(3));
    }
}
