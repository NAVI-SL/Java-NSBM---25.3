package Q3;

public class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment: Rs. " + amount);
    }
}
