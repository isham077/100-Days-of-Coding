package day_30;
import java.util.Scanner;
public class SearchElementMatrix {
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

        // Element to search
        int key = sc.nextInt();

        boolean found = false;

        // Search
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(matrix[i][j] == key) {
                    System.out.println("Found at row " + i + " column " + j);
                    found = true;
                }

            }
        }
        if(!found) {
            System.out.println("Not Found");
        }
    }
}
