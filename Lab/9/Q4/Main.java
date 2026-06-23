package Q4;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(7);
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());

        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());

        System.out.println("Triangle Area: " + t.calculateArea());
        System.out.println("Triangle Perimeter: " + t.calculatePerimeter());
    }
}
