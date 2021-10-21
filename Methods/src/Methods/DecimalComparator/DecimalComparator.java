package Methods.DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        int firstCheck=(int)(a*1000);
        int secondCheck=(int)(b*1000);
        return firstCheck - secondCheck == 0;

    }
}
