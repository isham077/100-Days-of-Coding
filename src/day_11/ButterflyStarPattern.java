package day_11;

public class ButterflyStarPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                {
                    for (int w = n; w >= 0; w--) {
                        for (int e = 1; e <= 5; e++) {
                            System.out.print("*");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
