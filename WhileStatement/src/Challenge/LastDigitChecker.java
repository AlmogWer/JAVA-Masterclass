package Challenge;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber,int secondNumber,int thirdNumber){
        if(firstNumber<10||firstNumber>1000||secondNumber<10||secondNumber>1000||thirdNumber<10||thirdNumber>1000){
            return false;
        }
        int lastDigitFirstNumber=firstNumber%10;
        int lastDigitSecondNumber=secondNumber%10;
        int lastDigitThirdNumber=thirdNumber%10;
        if(lastDigitFirstNumber==lastDigitSecondNumber||lastDigitFirstNumber==lastDigitThirdNumber||lastDigitSecondNumber==lastDigitThirdNumber){
            return true;
        }
        return false;
    }

    public static boolean isValid (int number){
        if(number<10||number>1000){
            return false;
        }
        return true;
    }
}
