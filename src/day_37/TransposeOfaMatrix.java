package day_37;

import java.util.Scanner;

public class TransposeOfaMatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int rows =sc.nextInt();
        int cols =sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");

        //transpose
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }


    }
}
