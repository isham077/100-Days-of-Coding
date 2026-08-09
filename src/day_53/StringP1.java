package day_53;

public class StringP1 {
    public static void  main(String[] args){
        //subString
        String name = "TonyStark";
        System.out.println(name.substring(0, 4));

        //ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //ToString Method of String class
        int number2 = 123;
        String str2 = Integer.toString(number2);
        System.out.println(str.length());

    }
}
