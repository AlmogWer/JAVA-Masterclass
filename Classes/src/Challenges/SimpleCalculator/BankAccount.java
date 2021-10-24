package Challenges.SimpleCalculator;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void depositFunds(int deposit){
        this.balance+=deposit;
        System.out.println("After deposit of "+deposit+", the balance is "+this.balance);
    }

    public void withdrawalFunds(int withdrawal){
        if(this.balance-withdrawal<0){
            System.out.println("Invalid withdrawal");
        }else{

        this.balance-=withdrawal;
            System.out.println("After withdrawal of "+withdrawal+", the balance is "+this.balance);
        }
    }

}
