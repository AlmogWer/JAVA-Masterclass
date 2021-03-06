import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayList=new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);

        double doubleValue = new Double(12.25);
//Autoboxing for Int
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
//Unboxing for int
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "-->" + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;// Integer.valueOf(56);
        int myInt = myIntValue;//myIntValue.intValue();
//Autoboxing for double

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);//myDoubleValues.add(Double.valueOf(dbl));
        }
//Unboxing for double
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);//double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

    }
}
