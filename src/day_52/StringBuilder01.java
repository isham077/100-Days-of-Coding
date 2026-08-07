package day_52;

public class StringBuilder01 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
//Insert char....

        sb.insert(0, 'S');
        System.out.println(sb);
//delete char....

        sb.delete(0, 1);
        System.out.println(sb);

    }
}

//Declaration
//StringBuilder sb = new StringBuilder("Apna College");
//System.out.println(sb);
//Get A Character from Index
//StringBuilder sb = new StringBuilder("Tony");
//Set Char
//System.out.println(sb.charAt(0));