public class Main {
    public static void main(String [] args) {
        Vehicle v1 = new Vehicle(101, "BMW", 120.0, false);
        v1.displayInfo();

        System.out.println();

        Car c1 = new Car(102, "Benz", 240, true, 2);
        c1.displayInfo();
    }
}
