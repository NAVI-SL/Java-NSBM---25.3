package Q4;

public class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area: " + area);
    }
}
