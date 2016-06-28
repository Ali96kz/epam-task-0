package com.epam.Ali96;

import java.util.Random;

public class Matrix {
    private int row,column;
    private int matrix[][];


    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;

    }
    public void prepare(){
        matrix = new int [row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = 0;
            }
        }
    }
    public void print(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void fill(){
        Random random = new Random(System.currentTimeMillis());
        matrix = new int[row][column];
        for (int i = 0; i < row; i++){
            for(int j = 0;j < column; j++){
                matrix[i][j] = random.nextInt(21) - 10;
            }
        }
        print();
    }


    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

}
