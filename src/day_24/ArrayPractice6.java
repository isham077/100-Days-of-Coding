package day_24;
import java.util.Scanner;
public class ArrayPractice6 {
    public static void main(String [] args){
        //Take an array of names as input from the user and print them on the screen.
        Scanner sc =new Scanner(System.in);

//        String [] names = new String[2];
//        String a =sc.next();
//        String b =sc.next();
//        names[0]=a;
//        names[1]=b;
//        System.out.println(a);
//        System.out.println(b);

        int size = sc.nextInt();
        String names[] = new String[size];

        //input
        for(int i=0;i<size;i++){
            names[i] = sc.next();
        }
        //output
        for(int i=0;i<names.length;i++){
            System.out.println("names "+(i+1) + " is : "+ names[i]);
        }
    }
}
