package Challenges.SimpleCalculator;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount Almog = new BankAccount();//("12345",0.00,"Bob Brown","myemail@bob.com","12345678");
        Almog.depositFunds(300);
        Almog.depositFunds(500);
        Almog.withdrawalFunds(700);
        Almog.withdrawalFunds(150);
        System.out.println(Almog.getPhoneNumber());

        BankAccount Tims=new BankAccount("Tim","tim@gmail.com","12345");
        System.out.println(Tims.getPhoneNumber()+" "+Tims.getBalance());

    }
}
