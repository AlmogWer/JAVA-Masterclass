package Challenges;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
      int numOfIntegers=  readInteger();
      int[] arrayOfIntegers=readElements(numOfIntegers);
      printElements(arrayOfIntegers);
        System.out.println(findMin(arrayOfIntegers));
    }

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Numbers?\r");
        int number=scanner.nextInt();
        return number;
    }

    public static int[] readElements(int numOfElements){
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfElements=new int[numOfElements];
        for(int i=0;i<numOfElements;i++){
            System.out.println("Please Enter number "+(i+1) +" out of "+numOfElements);
            arrayOfElements[i]=scanner.nextInt();

        }
        return arrayOfElements;
    }

    public static void printElements(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Number "+(i+1)+" is "+array[i]);
        }
    }

    public static int findMin(int[]array){
        int minValue = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]<minValue){
                minValue=array[i];
            }

        }
        return minValue;
    }

}
