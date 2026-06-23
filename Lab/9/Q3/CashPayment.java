package Q3;

public class CashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Cash Payment: Rs. " + amount);
    }
}
