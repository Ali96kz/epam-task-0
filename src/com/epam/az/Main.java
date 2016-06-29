package com.epam.az;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        MatrixFabric matrixFabric = new MatrixFabric();

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
