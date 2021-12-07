package Arrays;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = readIntegers();
        System.out.println(findMin(myIntegers));

    }

    public static int[] readIntegers() {
        System.out.println("How many values?");
        int count = scanner.nextInt();
        int[] array = new int[count];
        System.out.println("Enter the values you want...");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
}
