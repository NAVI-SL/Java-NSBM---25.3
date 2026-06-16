package Q1;

class Student extends Person {
    private String course;

    public Student(int personId, String name, int age, String course) {
        super(personId, name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}