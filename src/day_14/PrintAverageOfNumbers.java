package day_14;

import java.util.Scanner;

public class PrintAverageOfNumbers {
    public static void FindAverageOfNumbers(int a, int b, int c){
        int average;
        average = (a+b+c) / 3;
        System.out.println(average);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        FindAverageOfNumbers(a,b,c);
    }
}
