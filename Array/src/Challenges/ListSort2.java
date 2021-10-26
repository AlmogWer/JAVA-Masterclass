package Challenges;

import java.util.Scanner;

public class ListSort2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1=getIntegers(5);
        int[] array2 =sortIntegers(array1);
        printNumbers(array2);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        int temp = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp=sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;

    }
}
