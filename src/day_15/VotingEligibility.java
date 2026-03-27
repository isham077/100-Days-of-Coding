package day_15;

import java.util.Scanner;

public class VotingEligibility {
    public static boolean isEligible(int a){
        if(a>=18){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(isEligible(a));
    }
}
