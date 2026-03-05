
//Reverse right half pattern
public class reverseLeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i <= 1; i++) {
            for (int j = 0; j <= n; j++) {
                if(i+j>5){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
