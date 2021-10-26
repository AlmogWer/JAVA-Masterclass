import java.util.Arrays;

public class RefVsValues {
    public static void main(String[] args) {
        int myIntValue=10;
        int anotherIntValue=myIntValue;
        System.out.println("myIntValue= "+myIntValue);
        System.out.println("anotherIntValue= "+anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue= "+myIntValue);
        System.out.println("anotherIntValue= "+anotherIntValue);

        int[] myIntArray=new int[5];

        int[] anotherArray=myIntArray;
        System.out.println("MyIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+ Arrays.toString(anotherArray));

        anotherArray[0]=1;

        System.out.println("after change MyIntArray "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray "+ Arrays.toString(anotherArray));

modifyArray(myIntArray);

        System.out.println("after modify MyIntArray "+ Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray "+ Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){

        array[0]=2;
    }
}
