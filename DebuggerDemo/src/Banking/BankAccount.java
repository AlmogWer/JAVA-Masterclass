package Banking;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    //the branch arguement is true if the cosumter is performing transaction
    //at a branch with a teller, - it's false if customer performing transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    //the branch arguement is true if the cosumter is performing transaction
    //at a branch with a teller, - it's false if customer performing transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    //more methods that use firstname lastname and perform other functions
}
