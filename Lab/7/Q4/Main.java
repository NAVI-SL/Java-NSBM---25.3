package Q4;

public class Main {
    public static void main(String [] args) {
        
        Vehicle[] vehicles = {new Car(), new Motorcycle(), new Truck()};

        for (Vehicle v : vehicles) {
            v.startEngine();
        }
    }
}
