package Challenges;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1;i<=1000;i++){

            if(i%3==0&&i%5==0){
                sum+=i;
                count++;
               if(count==6){
                   System.out.println("sum"+sum);
                   break;
               }else{
                   System.out.println("number can be divided by 3 and 5= "+i);
                   System.out.println(count);
               }

            }
        }
    }
}
