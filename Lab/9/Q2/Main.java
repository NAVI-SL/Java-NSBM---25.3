package Q2;

public class Main {
    public static void main(String[] args) {
        Staff s = new Staff();
        s.name = "Kamal";
        s.basicSalary = 50000;

        System.out.println("Staff Salary = Rs. " + s.calculateSalary());

        Supervisor sup = new Supervisor();
        sup.name = "Nimal";
        sup.basicSalary = 50000;
        sup.teamSize = 5;

        System.out.println("Supervisor Salary = Rs. " + sup.calculateSalary());
    }
}
