package day_08;

public class RhombusPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (4 + i - 1); j++) {
                if (j >= i && j <= (4 + i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
