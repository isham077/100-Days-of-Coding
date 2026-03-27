package day_15;
import java.util.Scanner;

public class ReturnsTheGreaterAmong2Numbers {
    public static int greaterAmong2Numbers(int a, int b){
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(greaterAmong2Numbers(a,b));
   }
}
