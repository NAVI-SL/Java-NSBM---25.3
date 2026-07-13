public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(001, "Benz", 120);
		v.calculateSpeed();
		
		System.out.println("");
		
		Car c = new Car(002, "BMW", 150, 4);
		c.calculateSpeed();
	}
}
