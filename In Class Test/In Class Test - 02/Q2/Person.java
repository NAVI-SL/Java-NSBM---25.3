public class Person {
    private int personID;
    private String name;
    private int age;
    private String email;
    
    public Person(int personID, String name, int age, String email) {
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public void displayDetails() {
        System.out.println("Person ID is: " + personID);
        System.out.println("Person Name is: " + name);
        System.out.println("Person Age is: " + age);
        System.out.println("Person Email is: " + email);
    }
    
}
