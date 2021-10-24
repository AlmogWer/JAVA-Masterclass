package Challenges;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        int counter = 0;
        int sum = 0;
        long average = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;


            } else {

                break;
            }

        }
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/counter));
        scanner.close();
    }
}
