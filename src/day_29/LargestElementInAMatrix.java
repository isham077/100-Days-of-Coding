package day_29;
import java.util.Scanner;
public class LargestElementInAMatrix {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Assume first element is largest
        int max = matrix[0][0];

        // Find largest element
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }

            }
        }
        System.out.println("Largest Element = " + max);
    }
}
