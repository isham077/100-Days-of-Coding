package day_32;

import java.util.Scanner;

public class DeletionBasics {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        int n = 8;
        int position = 3; // index to delete

        // Shift elements to the left
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--; // decrease size

        // Display array after deletion
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}