package day_43;

public class LengthofAString {
    public static void main(String[] args) {

        String firstName = "Tony";
        String secondName = "stark";
        String fullName = firstName + "@" + secondName;

        System.out.println(fullName.length());
        //charAt
        for(int i=0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

    }
}
