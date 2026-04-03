package day_18;

public class ArrayPractice1 {
        public static void main(String []args) {
            numbersTest();
        }

        public static void numbersTest(){
            int [] number = new int[3];
            number[0] =123 ;
            number[1] =456 ;
            number[2] =799 ;

            //print the numbers
            for(int i=0;i<3;i++){
                System.out.println(number[i]);
            }
        }

}



