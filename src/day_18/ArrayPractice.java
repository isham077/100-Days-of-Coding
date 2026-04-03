package day_18;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        //output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(" x found at index : " + i);
            }
        }
    }
}







//practice
//EX:1

//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        //input
//        for (int i = 0; i < size; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        //output
//        for (int i = 0; i < size; i++) {
//            System.out.print(numbers[i]+" ");
//        }
//    }
//}

//EX:2

//        int [] marks = new int[3];
//        marks[0] = 98;
//        marks[1] = 99;
//        marks[2] = 94;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//       System.out.println(marks[2]);
//        for(int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }
