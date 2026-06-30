public abstract class Employee {
    protected int employeeId;
    protected String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    
    abstract double calculateSalary();
    abstract void displayDetails();
}