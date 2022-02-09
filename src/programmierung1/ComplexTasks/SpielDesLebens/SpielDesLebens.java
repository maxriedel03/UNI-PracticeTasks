package programmierung1.ComplexTasks.SpielDesLebens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpielDesLebens {

    public static void main(String[] args){
        simProgramm();
    }

    public static void simProgramm(){
        Scanner sc = new Scanner(System.in);
        int m;
        int[][] matrix;

        matrix = iniMatrix();

        System.out.println("Calculate to Generation: ");

        m = sc.nextInt();

        //fillMatrix(matrix);
        fillMatrixAlt(matrix);
        System.out.println("Input: ");
        outputMatrix(matrix);

        for(int i = 1; i <= m; i++){
            matrix = nextPopulation(matrix);
            System.out.println("\n Next Population:");
            outputMatrix(matrix);
        }
        sc.close();
    }
    public static int[][] nextPopulation(int[][] inputMatrix){
        int[][] nextMatrix;
        int inputLen;
        int livingCells;

        inputLen = inputMatrix.length;

        nextMatrix = new int[inputLen][inputLen];

        for(int i = 0; i < inputLen; i++){
            for(int j = 0; j < inputLen; j++){
                livingCells = 0;
                for (int k = i - 1; k <= i +1; k++){
                    for(int l = j - 1; l <= j +1; l++){
                        if(l != j || k!= i){
                            if(inputMatrix[(k + inputLen) % inputLen][(l + inputLen) % inputLen] == 1)
                                livingCells++;
                        }
                    }
                }
                if(livingCells == 3 || (livingCells == 2 && inputMatrix[i][j] == 1)){
                    nextMatrix[i][j] = 1;
                }else{
                    nextMatrix[i][j] = 0;
                }
            }
        }
        return nextMatrix;
    }
    public static void outputMatrix(int[][] matrix) {
        for(int[] arr : matrix){
            System.out.println();
            for(int i : arr){
                System.out.print(" | " + i);
            }
            System.out.print(" | ");
        }
        System.out.println();
    }
    public static void fillMatrixAlt(int[][] matrix){
        Scanner sc = new Scanner(System.in);
        int n;
        int input;
        n = matrix.length;
        for(int i = 0; i < n; i++){
            System.out.println("Row: " + i);
            for(int j = 0;j < n; j++){
                input = sc.nextInt();
                while(input != 1 && input != 0){
                    System.out.println("Falsche Eingabe! Bitte erneut eingeben! Feld: " + i + j);
                    input = sc.nextInt();
                }
                matrix[i][j] = input;
            }
        }
    }
    public static int[][] iniMatrix(){
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int n;
        System.out.println("Input Matrix Size: ");
        n = sc.nextInt();
        matrix = new int[n][n];
        return matrix;
    }
    //Initial initialization via Scanner now iniMatrix is used for that.
    public static void fillMatrix(int[][] matrix){
        Scanner sc = new Scanner(System.in);
        int n;
        int input;
        n = matrix.length;
        for(int i = 0; i < n; i++){
            System.out.println("Row: " + i);
            for(int j = 0; j < n; j++){
                input = sc.nextInt();
                if(input == 0 || input == 1){
                    matrix[i][j] = input;
                }else
                    throw new InputMismatchException("Expected Input: 0 or 1!");
            }
        }
    }
}
