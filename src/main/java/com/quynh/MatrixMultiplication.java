package com.quynh;

public class MatrixMultiplication {
    public static int MAX = 100;
    public static int i = 0, j = 0, k = 0;

    public static void multiplyMatrix(int row1, int col1, int A[][],
                                  int row2, int col2, int B[][],
                                  int C[][])
    {
        if (i >= row1)
            return;

        if (j < col2)
        {
            if (k < col1)
            {
                C[i][j] += A[i][k] * B[k][j];
                k++;

                multiplyMatrix(row1, col1, A, row2, col2, B, C);
            }

            k = 0;
            j++;
            multiplyMatrix(row1, col1, A, row2, col2, B, C);
        }

        j = 0;
        i++;
        multiplyMatrix(row1, col1, A, row2, col2, B, C);
    }


    public static void multiplyMatrix(int row1, int col1, int A[][],
                               int row2, int col2, int B[][])
    {
        if (row2 != col1)
        {
            System.out.println("Not Possible\n");
            return;
        }

        int[][] C = new int[MAX][MAX];

        multiplyMatrix(row1, col1, A, row2, col2, B, C);

        // Print the result
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < col2; j++)
                System.out.print(C[i][j]+" ");

            System.out.println();
        }
    }

}
