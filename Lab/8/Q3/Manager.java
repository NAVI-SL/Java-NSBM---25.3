package Q3;

class Manager extends Employee {
    private String department;

    public Manager(int employeeId, String employeeName, double salary, String department) {
        super(employeeId, employeeName, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}