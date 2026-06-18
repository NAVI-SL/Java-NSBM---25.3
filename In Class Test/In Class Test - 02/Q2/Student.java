public class Student extends Person {
    private double gpa;

    public Student(int personID, String name, int age, String email, double gpa) {
        super(personID, name, age, email);
        this.gpa = gpa;
    }   
}
