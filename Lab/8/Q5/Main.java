package Q5;

public class Main {
    public static void main(String[] args) {
        Payment payment;

        payment = new CashPayment(101, "Kamal", 5000, 5000);
        payment.processPayment();

        System.out.println();

        payment = new CardPayment(102, "Nimal", 7500, "1234-5678-9012");
        payment.processPayment();

        System.out.println();

        payment = new OnlinePayment(103, "Navitha", 10000, "PayPal");
        payment.processPayment();
    }
}
