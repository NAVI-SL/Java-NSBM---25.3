package Q1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Kamal", 18);

        try {
            s1.registerCourse(3);
            s1.registerCourse(4);
            s1.registerCourse(-2);
        } 
        catch (InvalidCreditException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (CreditLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final Credits: " + s1.getCurrentCredits());
    }
}