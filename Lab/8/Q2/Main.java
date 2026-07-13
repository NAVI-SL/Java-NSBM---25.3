public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(201, "Benz", 120);
		v.calculateSpeed();
		
		System.out.println("");
		
		Car c = new Car(202, "BMW", 150, 4);
		c.calculateSpeed();
	}
}
