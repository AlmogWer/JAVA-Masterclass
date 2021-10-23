package Challenge;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int reverse=0;
        int temp=number;
        while(temp>0){
            reverse=temp%10;
            temp/=10;
            switch(reverse){
                case 0:

            }
        }

    }
}
