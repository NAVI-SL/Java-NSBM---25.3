public class Vehicle {
	private int vehicleID;
	private String brand;
	private double speed;
	
	public Vehicle(int vehicleID, String brand, double speed) {
		this.vehicleID = vehicleID;
		this.brand = brand;
		this.speed = speed;
	}
	
	//getter
	public int getVeicleID() {
		return vehicleID;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getSpeef() {
		return speed;
	}
	
	//setter
	public void setVeicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void calculateSpeed() {
		System.out.println("Vehicle ID: " + vehicleID);
		System.out.println("Brand     : " + brand);
		System.out.println("Speed     : " + speed + "km/h");
	}
}