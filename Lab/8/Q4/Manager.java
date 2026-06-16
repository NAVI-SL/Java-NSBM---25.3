package Q4;

public class Manager extends Employee {
    private String department;

    public Manager(int personId, String name, double salary, String department) {
        super(personId, name, salary);
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Person ID: " + getPersonId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}
