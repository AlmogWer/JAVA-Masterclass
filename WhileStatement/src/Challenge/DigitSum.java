package Challenge;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("sum of digit in number 125 is "+sumDigits(8000));
        System.out.println("sum of digit in number 125 is "+sumDigits(1234));
        System.out.println("sum of digit in number 125 is "+sumDigits(3333));
        System.out.println("sum of digit in number 125 is "+sumDigits(55555555));
    }
    public static int sumDigits(int number){
        if(number<=9){
            return -1;
        }
        int sum=0;
        //125/12=12 ->12*1=120->125-120=5
        while(number>0){
            //extract the least significant digit
            int digit= number %10;
            sum +=digit;
            //drop the least significant digit
            number/=10;
        }
        return sum;
    }
}
