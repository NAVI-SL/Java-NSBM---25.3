package Q5;

public class Main {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount();
        s1.accountNumber = "SA-001";
        s1.holderName = "Alice";
        s1.balance = 5000;
        s1.interestRate = 3.5;

        s1.showDetails();
        s1.deposit(1000.0);
        s1.deposit(50.0, "USD");
        s1.applyInterest();

        System.out.println();

        BankAccount b1 = new SavingsAccount();
        b1.accountNumber = "SA-001";
        b1.holderName = "Alice";
        b1.balance = 5000;

        ((SavingsAccount) b1).interestRate = 3.5;
        b1.showDetails(); 

        BankAccount b2 = new LoanAccount();
        b2.accountNumber = "LA-002";
        b2.holderName = "Bob";
        b2.balance = 0;

        ((LoanAccount) b2).loanAmount = 20000;
        b2.showDetails(); 
    }
}
