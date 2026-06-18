public class Student extends Person {
    private double gpa;

    public Student(int personID, String name, int age, String email, double gpa) {
        super(personID, name, age, email);
        this.gpa = gpa;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student GPA is: " + gpa);
    }
}
