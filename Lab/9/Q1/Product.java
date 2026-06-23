public class Product {
    private String productCode;
    private double price;
    private int quantity;

    //getter
    public String getProductCode() {
        return productCode;
    }

    //setter
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    //getter
    public double getPrice() {
        return price;
    }

    //setter
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }

    //getter
    public int getQuantity() {
        return quantity;
    }

    //setter
    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid Quantity!");
        }
    }
}
