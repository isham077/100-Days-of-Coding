package day_36;
import java.util.Scanner;
public class TwoDArrayRowSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Row-wise Sum
        for (int i = 0; i < rows; i++) {

            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }
    }
}
