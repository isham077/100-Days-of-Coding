package day_9;

public class ButterflyStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 2 * n; i++) {
            int r = i <= n ? i : 2 * n - i;

            for (int j = 1; j <= 2 * n; j++) {
                if (j <= r || j > 2 * n - r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
