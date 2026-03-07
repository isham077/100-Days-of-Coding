package day_4;

public class DiamondPattern {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6;j++){
                if(i+j>6){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=5;i>=1;i--){
            for(int j=1;j<=6;j++){
                if(i+j>6){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
