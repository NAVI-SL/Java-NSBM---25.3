public class OnlineOrder {
    int orderId;
    String customerName;
    double itemPrice;
    int quantity;

    public OnlineOrder(int orderId, String customerName, double itemPrice, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double calculateTotal(double discountPercentage) {
        double total = itemPrice * quantity;
        double discount = total * discountPercentage / 100;
        return total - discount;
    }

    public void updateQuantity(int newQuantity) {
        if (newQuantity > 0) {
            quantity = newQuantity;
            System.out.println("Quantity updated to " + newQuantity + ".");
        } else {
            System.out.println("Invalid quantity.");
        }
    }

    public String getOrderSummary() {
        return "Order ID: " + orderId +
                ", Customer Name: " + customerName +
                ", Item Price: Rs. " + itemPrice +
                ", Quantity: " + quantity;
    }

    public static void main(String[] args) {
        OnlineOrder order1 = new OnlineOrder(1, "Nimal", 2500.0, 2);
        OnlineOrder order2 = new OnlineOrder(2, "Kamal", 1500.0, 3);

        double finalAmount = order1.calculateTotal(10);
        System.out.println("Final amount after 10% discount: Rs. " + finalAmount);

        order1.updateQuantity(5);
        order1.updateQuantity(-2);

        System.out.println(order1.getOrderSummary());
        System.out.println(order2.getOrderSummary());
    }
}