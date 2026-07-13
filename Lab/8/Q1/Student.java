public class Student extends Person {
	private String course;
	
	public Student(int PersonID, String name, int age, String course) {
		super(PersonID, name, age);
		this.course = course;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Person Course is: " + course);
	}
	
}