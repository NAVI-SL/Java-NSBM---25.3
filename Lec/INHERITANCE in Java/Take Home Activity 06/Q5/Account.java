package Q5;

public class Account {
    String accountNumber;
    String holderName;
    double balance;

    public void showDetails() {
        System.out.println("Account " + accountNumber + " |Holder: " + holderName + " | Balance: " + balance);
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount + " New balance: " + balance);
    }
}
