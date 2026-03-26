package day_13;

import java.util.Scanner;

public class TableOfaNumber {
    public static int CheckTableOfaNumber (int n) {
        System.out.println("Table of the number " + n);
        for (int i = 1; i <= 10; i++) {
            if (n * i >= 1) {
                System.out.println(n + " * " +i +" = " + n*i);
            }
        }
        return n;
    }
    public static void main (String[] args){
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            CheckTableOfaNumber(n);
    }
}
