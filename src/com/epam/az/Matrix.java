package com.epam.az;

import java.util.Random;

public class Matrix {
    private int row,column;
    private int matrix[][];

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;

    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                stringBuilder.append(Integer.toString(matrix[i][j])+" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void prepare(){
        matrix = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    public void FillRandom(){
        Random random = new Random(System.currentTimeMillis());
        matrix = new int[row][column];
        for (int i = 0; i < row; i++){
            for(int j = 0;j < column; j++){
                matrix[i][j] = random.nextInt(21) - 10;
            }
        }
    }

    public int getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }

    public int[][] getMatrix() {
        return matrix;
    }

}
