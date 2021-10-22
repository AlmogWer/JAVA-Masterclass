package Challenge;

public class IsEvenNumber {
    public static void main(String[] args) {
        int number=4;
        int finishNumber=20;
        int sum=0;
        int count=0;

        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            sum+=number;
            count++;
            if(count==5){
                System.out.println("even number"+number);
                System.out.println("Sum= "+sum);
                break;
            }
            System.out.println("even number"+number);
        }

    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
}
