package day_17;
import java.util.*;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateGCD(a, b);
    }

    public static void calculateGCD(int a, int b) {
        int x = 0;
        int y = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                x = i;
//                System.out.print(i + " ");
            }


        }

            for (int j = 1; j <= b; j++) {
                if (b % j == 0) {
                    y = j;
//                    System.out.print(j + " ");
                }
            }



        int highest = Math.max(x, y);
        System.out.println("Highest: " + highest);
    }
}




