package Q1;

public class Person {
    private int personID;
    private String name;
    private int age;

    Person(int personID, String name, int age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    // Getter
    public int getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setter 
    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Person ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
