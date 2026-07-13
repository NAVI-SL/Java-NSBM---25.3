public class Car extends Vehicle {
	private int numberOfDoors;
	
	public Car(int vehicleID, String brand, double speed, int numberOfDoors) {
		super(vehicleID, brand, speed);
		this.numberOfDoors = numberOfDoors;
	}
	
	//getter
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	//setter
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	@Override
	public void calculateSpeed(){
		super.calculateSpeed();
		System.out.println("Number of Doors: " + numberOfDoors);
	}
}