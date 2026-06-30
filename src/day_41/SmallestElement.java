package day_41;
import java.util.Scanner;

public class SmallestElement {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            // Input Matrix
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Assume first element is the smallest
                
            int min = matrix[0][0];

            // Find the smallest element
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {

                    if(matrix[i][j] < min) {
                        min = matrix[i][j];
                    }

                }
            }

            System.out.println("Smallest Element = " + min);

            sc.close();
        }
}

