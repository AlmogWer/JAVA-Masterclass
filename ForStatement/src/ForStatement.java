public class ForStatement {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest= " +calculateInterest(10000,2.0));

        for(int i=2;i<=8;i++){
            System.out.println("10,000 at "+i+"% interest= "+ calculateInterest(10000.0,i));
        }

        for(int i=8;i>=2;i--){
            System.out.println("10,000 at "+i+"% interest= "+ calculateInterest(10000.0,i));
        }
    }

    public static double calculateInterest(double amount,double interestRate){
        return (amount * (interestRate/100));
    }
}
