package day_31;

import java.util.Scanner;

public class GreaterThan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int[] arr = new int[n];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate average
        int avg = sum / arr.length;

        // Count elements greater than average
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}