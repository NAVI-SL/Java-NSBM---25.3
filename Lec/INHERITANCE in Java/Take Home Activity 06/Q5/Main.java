package Q5;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.accountNumber = "SA001";
        savings.holderName = "Navitha";
        savings.balance = 10000;
        savings.interestRate = 5;

        savings.showDetails();
        savings.applyInterest();

        System.out.println();

        LoanAccount loan = new LoanAccount();
        loan.accountNumber = "LA001";
        loan.holderName = "Navitha";
        loan.balance = 0;
        loan.loanAmount = 50000;

        loan.showDetails();
        loan.repayLoan(10000);

        System.out.println();

        FixedDepositAccount fixed = new FixedDepositAccount();
        fixed.accountNumber = "FD001";
        fixed.holderName = "Navitha";
        fixed.balance = 200000;
        fixed.maturityDate = "2026-12-31";

        fixed.showDetails();
        fixed.showMaturity();
    }
}
