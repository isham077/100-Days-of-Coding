package day_07;

public class KPattern {
    public static void main(String args[]) {
        int n = 5;
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int j = 1; j <= 5; j++) {

            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
