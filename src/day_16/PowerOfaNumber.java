package day_16;

import java.util.*;

public  class PowerOfaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        powerNumber(x, n);
    }

    public static void powerNumber(int x, int n) {

        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        System.out.println("x to the power n is : " + result);
    }
}