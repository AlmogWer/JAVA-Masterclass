package Challenge;

public class FirstAndLastNumber {
    public static void main(String[] args) {
        sumFirstAndLastDigit(20);
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int lastDigit=number%10;
        int firstDigit=0;
        int temp=number;
        while(temp>0){
          firstDigit=temp;
          temp/=10;

            }

        return lastDigit+firstDigit;
    }
}
