package Challenge;

public class AllFactors {
    public static void main(String[] args) {
        printFactors(10);
    }
    public static void printFactors(int number){
        if(number<1) {
            System.out.println("Invalid Value");
        }

        int divider=1;
        while(divider<=number){
            if(number%divider==0){
                System.out.println(divider);
                divider++;
            }else{
                divider++;
            }

        }
    }
}
