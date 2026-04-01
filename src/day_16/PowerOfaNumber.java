package day_16;

import java.util.*;

public  class PowerOfaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        powerNumber(x,n);
    }

    public static void powerNumber(int x, int n) {
        int result = (int) Math.pow(x, n);
        System.out.println(result);
        }
    }




