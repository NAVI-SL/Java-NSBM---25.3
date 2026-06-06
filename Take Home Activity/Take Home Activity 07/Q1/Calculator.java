public class Calculator {

    void add(int a, int b) {
        int result = a + b;
        System.out.println("Int sum: " + result);
    }

    void add(double a, double b) {
        double result = a + b;
        System.out.println("Double sum: " + result);
    }

    void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Three-int sum: " + result);
    }
}
