package com.epam.az;

import java.util.Random;

public class MatrixFactory {

    public Matrix getRandomFillMatrix(){
        Random random = new Random(System.currentTimeMillis());

        int row = random.nextInt(7) + 2, column = random.nextInt(7) + 2;
        int[][] matrix = new int[row][column];

        Matrix matrixA = new Matrix();

        for (int i = 0; i < row; i++){
            for(int j = 0;j < column; j++){
                matrix[i][j] = random.nextInt(21) - 10;
            }
        }
        matrixA.setMatrix(matrix);
        return matrixA;
    }

    public Matrix getRandomFillMatrix(int column){
        Random random = new Random(System.currentTimeMillis());
        int row = random.nextInt(7) + 2;

        Matrix matrixA = new Matrix();
        int[][] matrix = new int[column][row];
        for (int i = 0; i < column; i++){
            for(int j = 0;j < row; j++){
                matrix[i][j] = random.nextInt(21) - 10;
            }
        }

        matrixA.setMatrix(matrix);
        return matrixA;
    }
}
