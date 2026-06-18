package Q2;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int vehicleId, String brand, double speed, int numberOfDoors) {
        super(vehicleId, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void calculateSpeed() {
        System.out.println("Car is running at speed: " + getSpeed() + " km/h");
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
