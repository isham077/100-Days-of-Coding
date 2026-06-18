package day_32;
import java.util.Scanner;
public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);

        sc.close();
    }
}