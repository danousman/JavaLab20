package kz.desh.matrix.operation.impl;

import kz.desh.matrix.operation.MatrixOperation;

/**
 * Class for multiplying matrix
 * Created by Danila_Dashko on 9/29/2016.
 */
public class MultiplyMatrixOperation implements MatrixOperation {

    public int[][] execute(int[][] a, int[][] b) {
        if (a == null || b == null) {
            return null;
        }

        if (!checkMatrix(a, b)) {
            return null;
        }

        int n = a.length;
        int k = b[0].length;
        int m = b.length;
        int[][] matrix = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int q = 0; q < k; q++) {
                for (int w = 0; w < m; w++) {
                    matrix[i][q] += a[i][w] * b[w][q];
                }
            }
        }

        return matrix;
    }

    private boolean checkMatrix(int[][] a, int[][] b) {
        return a[0].length == b.length;
    }
}
