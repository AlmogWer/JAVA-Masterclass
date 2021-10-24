package Challenges;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        readingUserSum();

    }

    public static void readingUserSum() {
        int counter = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(counter<=10){
            System.out.println("Enter number #"+counter+" :");
            boolean hasInt=scanner.hasNextInt();
            if(hasInt){
                int num=scanner.nextInt();
                sum+=num;
                counter++;
            }else{
                System.out.println("Invalid Number");
                scanner.nextLine();
                counter++;

            }
        }
        System.out.println("Sum:"+sum);
    }
}
