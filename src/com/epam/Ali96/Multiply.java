package com.epam.Ali96;


public class Multiply {
    private Matrix matrixA, matrixB;
    private int arrayA[][], arrayB[][], arrayC[][];
    public Matrix  calc(){
        Matrix matrixC = new Matrix(matrixA.getRow(), matrixB.getColumn());

        arrayA = matrixA.getMatrix();
        arrayB = matrixB.getMatrix();

        matrixC.prepare();
        arrayC = matrixC.getMatrix();

        for(int i = 0; i < matrixA.getRow(); i++){
            for(int j = 0; j < matrixB.getColumn(); j++){

                for(int z = 0; z < matrixA.getRow(); z++) {
                    arrayC[i][j] += arrayA[i][z]*arrayB[z][j];
                }

            }
        }

        return matrixC;
    }

    public void setMatrixA(Matrix matrixA) {
        this.matrixA = matrixA;
    }

    public void setMatrixB(Matrix matrixB) {
        this.matrixB = matrixB;
    }


}
