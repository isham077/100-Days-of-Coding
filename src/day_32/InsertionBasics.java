package day_32;
import java.util.Scanner;

public class InsertionBasics {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        // Input 5 elements
        int size = 5;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int value = 18;      // Element to insert
        int position = 3;    // Index where insertion is required

        // Shift elements to the right
        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the element
        arr[position] = value;
        size++;

        // Display the array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}