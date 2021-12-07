package Arrays;

import java.util.Scanner;

public class sortChallenge2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(4);
        printArray(myIntegers);
        System.out.println("----sorted-----");
        int[] sortedArray = sortArray(myIntegers);
        printArray(sortedArray);


    }

    public static int[] getIntegers(int values) {
        System.out.println("Enter " + values + " Values");
        int[] array = new int[values];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + ((int) i + (int) 1) + " Is " + array[i]);

        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
