package day_34;
import java.util.Scanner;

public class MainDiagonal {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for(int i = 0; i < rows; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Main Diagonal Sum = " + sum);

    }

}
