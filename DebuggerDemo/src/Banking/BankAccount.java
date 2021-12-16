package Banking;

public class BankAccount {
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;
    private String firstName;
    private String lastName;
    private double balance;
    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
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

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    //more methods that use firstname lastname and perform other functions
}
