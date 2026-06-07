package Q4;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area: " + result);
    }
}
