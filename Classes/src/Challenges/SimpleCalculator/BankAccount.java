package Challenges.SimpleCalculator;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789",2.50,"Default name","Default address","default phone");
        System.out.println("Empty cons called");
    }

    public BankAccount(String accountNumber,double balance,String customerName,String email,String phoneNumber){
        System.out.println("Accont cons with paramaters called");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999",100.55,customerName,email,phoneNumber);

    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("After deposit of " + deposit + ", the balance is " + this.balance);
    }

    public void withdrawalFunds(double withdrawal) {
        if (this.balance - withdrawal < 0) {
            System.out.println("Invalid withdrawal - only " + this.balance + " is available ");
        } else {

            this.balance -= withdrawal;
            System.out.println("After withdrawal of " + withdrawal + ", the balance is " + this.balance);
        }
    }

}
