package com.epam.az;

import java.util.Random;

public class MatrixFabric {

    public Matrix getRandomFillMatrix(){
        Random random = new Random(System.currentTimeMillis());
        int row = random.nextInt(7) + 2, column = random.nextInt(7) + 2;

        Matrix matrixA = new Matrix(row, column) ;
        matrixA.FillRandom();

        return matrixA;
    }

    public Matrix getRandomFillMatrix(int column){
        Random random = new Random(System.currentTimeMillis());
        int row = random.nextInt(7) + 2;

        Matrix matrixA = new Matrix( column, row);
        matrixA.FillRandom();
        return matrixA;
    }
}
