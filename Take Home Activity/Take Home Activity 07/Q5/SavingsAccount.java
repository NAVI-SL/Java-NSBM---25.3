package Q5;

public class SavingsAccount extends BankAccount {
    double interestRate;
    @Override
    void showDetails(){
         System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Balance: " + balance + " | Type: Savings | Rate: " + interestRate + "%");
    
    }
    void applyInterest(){
        balance += balance * interestRate / 100;
        System.out.println("Interest applied. New Balance: " + balance );
    }
}
