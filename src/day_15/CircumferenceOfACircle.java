package day_15;

import java.util.Scanner;

public class RadiusAndCircumferenceOfACircle {
    public static Double calculateCircumference(Double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double radius =sc.nextDouble();
        System.out.println(calculateCircumference(radius));

        sc.close();
    }
}


