package com.epam.az;


public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        MatrixFactory matrixFabric = new MatrixFactory();

        Matrix matrixA = matrixFabric.getRandomFillMatrix();
        Matrix matrixB = matrixFabric.getRandomFillMatrix(matrixA.getColumn());


        System.out.println("First matrix \n"+
                matrixA.toString());

        System.out.println("Second matrix \n"+
                matrixB.toString());
        Matrix matrixC = multiplier.multiply(matrixA, matrixB);

        System.out.println("A * B \n"+
                 matrixC.toString());


    }
}
