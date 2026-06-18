package Q5;

public class OnlinePayment extends Payment {
    private String platform;

    public OnlinePayment(int paymentId, String customerName, double amount, String platform) {
        super(paymentId, customerName, amount);
        this.platform = platform;
    }

    @Override
    public void processPayment() {
        System.out.println("Online Payment");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Amount: " + getAmount());
        System.out.println("Platform: " + platform);
    }
}