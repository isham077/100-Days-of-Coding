package day_38;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

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

        // Matrix Addition
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print Result Matrix
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
