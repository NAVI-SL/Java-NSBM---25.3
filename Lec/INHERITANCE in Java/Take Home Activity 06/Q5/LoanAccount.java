package Q5;

public class LoanAccount extends Account {
    double loanAmount;

    public void repayLoan(double amount) {
        loanAmount -= amount;
        System.out.println("Loan repaid: " + amount + " Remaining: " + loanAmount);
    }
}
