package com.epam.az;

public class MatrixPrinter {

    public void printMultiplicationRandomMatrix(){
        Multiplier multiplier = new Multiplier();
        MatrixFactory matrixFactory = new MatrixFactory();

        Matrix matrixA = matrixFactory.getRandomFillMatrix();
        Matrix matrixB = matrixFactory.getRandomFillMatrix(matrixA.getColumn());

        Matrix matrixC = multiplier.multiply(matrixA, matrixB);

        System.out.println("First matrix \n"+
                matrixA.toString());

        System.out.println("Second matrix \n"+
                matrixB.toString());


        System.out.println("A * B \n"+
                matrixC.toString());


    }
}
