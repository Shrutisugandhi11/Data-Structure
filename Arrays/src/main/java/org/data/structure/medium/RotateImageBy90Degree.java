package org.data.structure.medium;

import java.util.Arrays;

public class RotateImageBy90Degree {

    public static int[][] rotate(int[][] matrix) {

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int[][] resMatrix = new int[rowLen][colLen];

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                resMatrix[col][rowLen - row - 1] = matrix[row][col];
            }
        }
        return resMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1 = {{5, 4, 2, 0}, {6, 5, 0, 1}, {7, 0, 3, 1}, {0, 5, 1, 2}};
        int[][] rotatedMatrix = rotate(matrix1);
        for (int[] matrixLoop : rotatedMatrix)
            System.out.println(Arrays.toString(matrixLoop));
    }
}
