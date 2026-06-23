package Q2;

public class Supervisor extends Staff {
    int teamSize;

    @Override
    public double calculateSalary() {
        return basicSalary + (teamSize * 1000);
    }
}
