package day_02;

//LeftHalfPyramid

public class LeftHalfPyramid {
    public static void main(String args[]) {

        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
