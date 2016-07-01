package com.epam.az;


public class Matrix {

    private int matrix[][];

    public Matrix(){

    }

    public Matrix(int row, int column) {
        matrix = new int[row][column];
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < getRow(); i++){
            for(int j = 0; j < getColumn(); j++){
                stringBuilder.append(Integer.toString(matrix[i][j])+" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public int[][] getMatrix() {
        return matrix;
    }
    public int getRow() {
        return matrix.length;
    }
    public int getColumn() {
        return matrix[0].length;
    }


}
