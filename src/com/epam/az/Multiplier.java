package com.epam.az;


public class Multiplier {

    public Matrix  multiply(Matrix matrixA, Matrix matrixB){
        Matrix matrixC = new Matrix(matrixA.getRow(), matrixB.getColumn());

        matrixC.prepare();

        int [][] arrayA = matrixA.getMatrix();
        int [][] arrayB = matrixB.getMatrix();
        int [][] arrayC = matrixC.getMatrix();
        int rowC = arrayC.length, columnC = arrayC[0].length, columnA = arrayA[0].length;
        for(int i = 0; i < rowC; i++){
            for(int j = 0; j < columnC; j++){
                for(int z = 0; z < columnA; z++) {
                    arrayC[i][j] += arrayA[i][z] * arrayB[z][j];
                }

            }
        }
        return matrixC;
    }
}
