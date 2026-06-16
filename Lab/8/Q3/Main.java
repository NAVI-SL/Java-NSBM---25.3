package Q3;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "Kamal", 150000, "IT");
        Developer d1 = new Developer(102, "Navitha", 100000, "Java");

        System.out.println("Manager Bonus: " + m1.calculateBonus());
        System.out.println("Developer Bonus: " + d1.calculateBonus());
    }
}