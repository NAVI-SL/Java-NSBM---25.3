public class RectangleAreaCalculator {
    private double length;
    private double width;

    public RectangleAreaCalculator(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        RectangleAreaCalculator rectangle =
                new RectangleAreaCalculator(12.5, 6.0);

        System.out.println("Area = " + rectangle.calculateArea());
    }
}
