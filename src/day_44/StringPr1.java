package day_44;

import java.util.Scanner;

public class StringPr1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for(int i=0; i<str.length();i++){
//            if(i==new String "e"){
            if(str.charAt(i) == 'e') {
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
