public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Smith");
        person.printFullName();
    }
}
