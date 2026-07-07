package Q1;

class Student {
    private String studentId;
    private String name;
    private int currentCredits;

    public Student(String studentId, String name, int currentCredits) {
        this.studentId = studentId;
        this.name = name;
        this.currentCredits = currentCredits;
    }

    public void registerCourse(int credits)
            throws InvalidCreditException, CreditLimitExceededException {

        if (credits <= 0) {
            throw new InvalidCreditException("Invalid credit amount.");
        }

        if (currentCredits + credits > 24) {
            throw new CreditLimitExceededException("Credit limit exceeded.");
        }

        currentCredits += credits;
        System.out.println("Registration successful!");
        System.out.println("Updated Credits: " + currentCredits);
    }

    public int getCurrentCredits() {
        return currentCredits;
    }
}