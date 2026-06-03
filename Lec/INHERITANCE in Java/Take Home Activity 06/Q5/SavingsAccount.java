package Q5;

public class SavingsAccount extends Account {
    double interestRate;

    public void applyInterest() {
        balance += (balance * interestRate / 100);
        System.out.println("Interest applied. New balance: " + balance);
    }
}
