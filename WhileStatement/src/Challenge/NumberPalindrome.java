package Challenge;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3553));
    }
    public static boolean isPalindrome(int number){
        if(number<0){
            number*=-1;
        }
        int reverse=0;
        int temp=number;
        while(temp>0){
            int lastDigit=temp%10;
            reverse=(reverse*10)+lastDigit;
            temp/=10;
        }
        if(reverse==number){
            return true;
        }else{
            return false;
        }
    }
}
