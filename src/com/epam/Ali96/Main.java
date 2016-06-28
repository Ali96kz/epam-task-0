package com.epam.Ali96;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrix matrix;
        Multiply multiply = new Multiply();
        int row, column;

        System.out.println("Alloha");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first matrix size");
        System.out.print("Insert row: " );
         row = scanner.nextInt();
        System.out.print("Insert column: " );
        column = scanner.nextInt();
        matrix = new Matrix(row, column);
        matrix.fill();
        multiply.setMatrixA(matrix);

        System.out.println("Insert second matrix size");
        System.out.print("Insert row: " );
        row = scanner.nextInt();
        System.out.print("Insert column: " );
        column = scanner.nextInt();
        matrix = new Matrix(row, column);
        matrix.fill();


        multiply.setMatrixB(matrix);
        matrix =  multiply.calc();
        System.out.println("Result \n");
        matrix.print();


    }
}
