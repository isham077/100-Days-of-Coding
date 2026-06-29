package day_40;
import java.util.Scanner;

public class FrequencyMatrix {
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

            int count = 0;

            // Find Frequency
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {

                    if(matrix[i][j] == key) {
                        count++;
                    }

                }
            }

            System.out.println(key + " occurs " + count + " times");

            sc.close();
        }
    }

