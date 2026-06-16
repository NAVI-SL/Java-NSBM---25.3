package Q2;

public class Vehicle {
    private int vehicleId;
    private String brand;
    private double speed;

    public Vehicle(int vehicleId, String brand, double speed) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.speed = speed;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void calculateSpeed() {
        System.out.println("Vehicle speed is: " + speed + " km/h");
    }
}
