package Methods.TeenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber,int secondNumber,int thirdNumber){
        if((firstNumber<=19&&firstNumber>=13)||(secondNumber<=19&&secondNumber>=13)||(thirdNumber<=19&&thirdNumber>=13)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int firstNumber){
        if(firstNumber<=19&&firstNumber>=13){
            return true;
        }
        return false;
    }
}
