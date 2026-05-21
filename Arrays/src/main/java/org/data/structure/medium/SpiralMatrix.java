package org.data.structure.medium;

public class SpiralMatrix {
    public static int[][] spiralMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col:row){
                System.out.println(col);
            }
        }
        return new int[1][1];
    }

    public static void main(String[] args) {

    }
}
