package Challenges;

public class Sum33 {
    public static void main(String[] args) {
        System.out.println(2222%10);
    }
    public static boolean isOdd(int number){
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if ( (end < start) || (start < 0) || (end < 0) ){
            return -1;
        }
        int sum = 0;

        for (int i = start; i<=end; i++){
            if (isOdd(i)){
                sum +=i;
            }
        }
        return sum;

    }
}
