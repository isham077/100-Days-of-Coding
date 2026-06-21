package day_35;
import java.util.Scanner;
public class AntiDiagonal {
    public static void main(String[] args){
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
                sum += matrix[i][rows - 1 - i];
            }

            System.out.println("Anti Diagonal Sum = " + sum);

    }
}
