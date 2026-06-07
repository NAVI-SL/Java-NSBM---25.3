package Q5;

public class LoanAccount extends BankAccount{
    double loanAmount;

    @Override
    void showDetails(){
     System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Balance: " + balance + " | Type: Loan | Loan: " + loanAmount);
    }
    
    void repayLoan(double amount){
        loanAmount -= amount;
        System.out.println("Loan repaid: " + amount + ". Remaining: " + loanAmount);
    }
}
