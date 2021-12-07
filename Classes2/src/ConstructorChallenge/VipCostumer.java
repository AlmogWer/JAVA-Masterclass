package ConstructorChallenge;

public class VipCostumer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCostumer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCostumer(String name, double creditLimit) {
        this(name,creditLimit,"No email provided");

    }

    public VipCostumer() {
       this("no name provided",0.0,"no email provided");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
