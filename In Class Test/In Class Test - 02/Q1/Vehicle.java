public class Vehicle {
    private int vehicleID;
    private String brand;
    private double speed;
    private boolean isElectric;

    Vehicle(int vehicleID, String brand, double speed, boolean isElectric) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.speed = speed;
        this.isElectric = isElectric;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
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

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void displayInfo() {
        System.out.println("Vehicle ID is: " + vehicleID);
        System.out.println("Vehicle Brad is: " + brand);
        System.out.println("Vehicle Speed is: " + speed + "km/h");
        System.out.println("Electric Power: " + isElectric);
    }
}
