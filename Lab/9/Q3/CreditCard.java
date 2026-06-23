package Q3;

public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment: Rs. " + amount);
    }
}
