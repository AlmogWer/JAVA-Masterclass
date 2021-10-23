package Challenge;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int temp=number;
        int currentDigit=0;
        while(temp>0){
            currentDigit=temp%10;
            temp/=10;
            if(currentDigit%2==0){
                sum+=currentDigit;
            }
        }
            return sum;
    }
}
