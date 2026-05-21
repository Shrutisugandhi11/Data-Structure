package org.data.structure.medium;

public class SetMatrixZero {
    public void setZeroesBruteFroce(int[][] matrix) {
        int rLen = matrix.length;
        int cLen = matrix[0].length;
        for (int r = 0; r < rLen; r++) {
            for (int c = 0; c < cLen; c++) {

                if (matrix[r][c] == 0) {

                    for (int i = 0; i < rLen; i++) {
                        if (matrix[r][i] != 0)
                            matrix[r][i] = -1;
                    }
                    for (int j = 0; j < cLen; j++) {
                        if (matrix[j][c] != 0)
                            matrix[j][c] = -1;
                    }
                } else if (matrix[r][c] == -1) {
                    matrix[r][c] = 0;

                }

            }
        }
        for (int r = 0; r < rLen; r++) {
            for (int c = 0; c < cLen; c++) {
                if (matrix[r][c] == -1)
                    matrix[r][c] = 0;
                else if (matrix[r][c] == 0)
                    matrix[r][c] = -1;
            }
        }
    }

    public void setZeros(int[][] matrix) {
        int rLen = matrix.length;
        int cLen = matrix[0].length;
        int[] row = new int[rLen];
        int[] col = new int[cLen];
        for (int i = 0; i < rLen; i++) {
            for (int j = 0; j < cLen; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < rLen; i++) {
            for (int j = 0; j < cLen; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
