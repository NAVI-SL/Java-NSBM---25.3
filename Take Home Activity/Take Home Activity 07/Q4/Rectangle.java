package Q4;

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    void area() {
        double area = width * height;
        System.out.println("Area: " + area);
    }
}
