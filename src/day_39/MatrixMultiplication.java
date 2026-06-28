package day_39;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 2;
        int cols = 2;

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input Matrix A
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                for(int k = 0; k < cols; k++) {

                    result[i][j] += matrixA[i][k] * matrixB[k][j];

                }

            }

        }

        // Print Result
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
