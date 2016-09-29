package kz.desh.matrix.runner;

import kz.desh.matrix.factory.MatrixFactory;
import kz.desh.matrix.operation.MatrixOperation;
import kz.desh.matrix.operation.impl.MultiplyMatrixOperation;

import java.util.Arrays;

/**
 * Runner class
 * Created by Danila_Dashko on 9/29/2016.
 */
public class App {

    public static void main(String[] args) {
        int[][] a = MatrixFactory.generateMatrix(2, 3, 10);
        int[][] b = MatrixFactory.generateMatrix(3, 2, 10);
        MatrixOperation matrixOperation = new MultiplyMatrixOperation();
        System.out.println(Arrays.deepToString(matrixOperation.execute(a, b)));
    }
}
