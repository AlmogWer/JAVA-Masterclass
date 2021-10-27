package Challenge;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Almog", 75.05);
        bank.addCustomer("Adelaide", "Shani", 955.35);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.34);
        bank.addCustomerTransaction("Sydney", "Bob", 50.45);
        bank.addCustomerTransaction("Adelaide", "Shani", 03.45);
        bank.addCustomerTransaction("Adelaide", "Almog", 00.45);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");

        }
        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }
    }
}
