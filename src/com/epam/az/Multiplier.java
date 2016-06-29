package com.epam.az;


public class Multiplier {

    public Matrix  multiply(Matrix matrixA, Matrix matrixB){
        Matrix matrixC = new Matrix(matrixA.getRow(), matrixB.getColumn());
        
        matrixC.prepare();

        int [][] arrayA = matrixA.getMatrix();
        int [][] arrayB = matrixB.getMatrix();
        int [][] arrayC = matrixC.getMatrix();

        for(int i = 0; i < arrayC.length; i++){
            for(int j = 0; j < arrayC[0].length; j++){
                for(int z = 0; z <arrayA[0].length; z++) {

                    arrayC[i][j] += arrayA[i][z] * arrayB[z][j];
                }

            }
        }
        return matrixC;
    }
}
