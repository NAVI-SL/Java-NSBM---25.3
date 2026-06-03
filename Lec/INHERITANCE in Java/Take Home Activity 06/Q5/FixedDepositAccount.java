package Q5;

public class FixedDepositAccount extends Account {
    String maturityDate;

    public void showMaturity() {
        System.out.println("Fixed deposit matures on: " + maturityDate);
    }
}
