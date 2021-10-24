package Challenges.SimpleCalculator;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount Almog= new BankAccount();
        Almog.depositFunds(300);
        Almog.depositFunds(500);
        Almog.withdrawalFunds(700);
        Almog.withdrawalFunds(150);

    }
}
