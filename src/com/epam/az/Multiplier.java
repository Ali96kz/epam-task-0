package com.epam.az;


public class Multiplier {

    public Matrix  multiply(Matrix matrixA, Matrix matrixB){
        Matrix matrixC = new Matrix(matrixA.getRow(), matrixB.getColumn());

        int [][] arrayA = matrixA.getMatrix();
        int [][] arrayB = matrixB.getMatrix();
        int [][] arrayC = matrixC.getMatrix();

        for(int i = 0; i < arrayA.length; i++){
            for(int j = 0; j < arrayB[1].length; j++){
                arrayC[i][j] = 0;
                for(int z = 0; z < matrixA.getRow(); z++) {
                    arrayC[i][j] += arrayA[i][z] * arrayB[z][j];
                }

            }
        }

        return matrixC;
    }
}
