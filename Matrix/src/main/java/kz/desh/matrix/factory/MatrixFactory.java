package kz.desh.matrix.factory;

import java.util.Random;

/**
 * Factory class for generation matrix
 * Created by Danila_Dashko on 9/29/2016.
 */
public class MatrixFactory {

    public static int[][] generateMatrix(int n, int m, int range) {
        Random random = new Random();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int q = 0; q < m; q++) {
                matrix[i][q] = random.nextInt(range);
            }
        }

        return matrix;
    }
}
