package Q5;

public class Payment {
    private int paymentId;
    private String customerName;
    private double amount;

    public Payment(int paymentId, String customerName, double amount) {
        this.paymentId = paymentId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing general payment...");
    }

}
