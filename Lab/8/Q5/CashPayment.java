package Q5;

public class CashPayment extends Payment {
    private double cashReceived;

    public CashPayment(int paymentId, String customerName, double amount, double cashReceived) {
        super(paymentId, customerName, amount);
        this.cashReceived = cashReceived;
    }

    @Override
    public void processPayment() {
        System.out.println("Cash Payment");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Amount: " + getAmount());
        System.out.println("Cash Received: " + cashReceived);
    }
}
