public class Car extends Vehicle {
    private int numDoors;

    public Car(int vehicleID, String brand, double speed, boolean isElectric, int numDoors) {
        super(vehicleID, brand, speed, isElectric);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Doors have: " + numDoors);
    }
}
