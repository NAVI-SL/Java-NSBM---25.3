package Q3;

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int employeeId, String employeeName, double salary, String programmingLanguage) {
        super(employeeId, employeeName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
