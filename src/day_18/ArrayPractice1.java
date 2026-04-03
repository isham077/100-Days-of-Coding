package day_18;

public class ArrayPractice1 {
    public static void main(String[] args) {
        numbersTest();
        sumOfArray();
    }

    public static void numbersTest() {
        int[] number = new int[3];
        number[0] = 123;
        number[1] = 456;
        number[2] = 789;

        //print the numbers
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }
    }

    public static void sumOfArray() {
        int[] numbers2 = {5, 94};
        numbers2[0] = 6;            //changed the first element from 5 to 6.
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int i = 0; i < numbers2.length; i++) {
            sum += numbers2[i];
        }
        System.out.println("The sum is : " + sum);
    }

}



