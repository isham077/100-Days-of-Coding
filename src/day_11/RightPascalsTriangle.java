package day_11;

public class RightPascalsTriangle {
    public static void main(String[] args) {
        int n = 5;   // This is the maximum width (the middle row)

         // Part 1: Growing Top Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Part 2: Shrinking Bottom Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
