package Q5;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(int paymentId, String customerName, double amount, String cardNumber) {
        super(paymentId, customerName, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Card Payment");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Amount: " + getAmount());
        System.out.println("Card Number: " + cardNumber);
    }
}
