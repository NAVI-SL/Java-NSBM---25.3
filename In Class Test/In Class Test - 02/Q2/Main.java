public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(101, "Navitha", 19, "navithanavindul@gmail.com");
        p1.displayDetails();

        System.out.println();

        Student s1 = new Student(102, "Akitha", 22, "akithapasandul@gmail.com", 3.1);
        s1.displayDetails();
    }
}
