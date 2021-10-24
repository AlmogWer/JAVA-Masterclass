package Challenges;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        minAndMax();

    }
    public static void minAndMax(){
        int maxNumber=0;
        int minNumber=0;
        boolean first=true;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Enter number:");
            boolean isInt=scanner.hasNextInt();
            if(!isInt){
                break;
            }
            int num=scanner.nextInt();
            if(first){
                first=false;
                minNumber=num;
            }

            if(num<minNumber||minNumber==-1){
                minNumber=num;
            }
            if(num>maxNumber){
                maxNumber=num;
            }

        }
        System.out.println("min number "+minNumber+" max number "+maxNumber);
    }
}
