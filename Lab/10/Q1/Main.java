public class Main {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee(101, "Navitha", 100000);

        PartTimeEmployee p1 = new PartTimeEmployee(102, "Alex", 100, 500);

        f1.displayDetails();
        p1.displayDetails();
    }
}
