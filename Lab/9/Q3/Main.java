package Q3;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new PayPal(),
            new CashPayment()
        };

        for (PaymentMethod p : payments) {
            p.processPayment(5000);
        }
    }
}
