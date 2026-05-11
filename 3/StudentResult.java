public class StudentResult {
    int studentId;
    String studentName;
    double mathMark;
    double scienceMark;
    double englishMark;

    public StudentResult(int studentId, String studentName, double mathMark, double scienceMark, double englishMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.englishMark = englishMark;
    }

    public double calculateAverage() {
        return (mathMark + scienceMark + englishMark) / 3;
    }

    public String getGrade() {
        double average = calculateAverage();

        if (average >= 75) {
            return "A";
        } else if (average >= 65) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else if (average >= 35) {
            return "S";
        } else {
            return "F";
        }
    }

    public void updateMark(String subject, double newMark) {
        if (subject.equalsIgnoreCase("math")) {
            mathMark = newMark;
        } else if (subject.equalsIgnoreCase("science")) {
            scienceMark = newMark;
        } else if (subject.equalsIgnoreCase("english")) {
            englishMark = newMark;
        } else {
            System.out.println("Invalid subject name.");
        }
    }

    public String getResultSheet() {
        return "Student ID: " + studentId +
                "\nStudent Name: " + studentName +
                "\nMath Mark: " + mathMark +
                "\nScience Mark: " + scienceMark +
                "\nEnglish Mark: " + englishMark +
                "\nAverage: " + calculateAverage() +
                "\nGrade: " + getGrade();
    }

    public static void main(String[] args) {
        StudentResult student1 = new StudentResult(1, "Amal", 80, 75, 70);
        StudentResult student2 = new StudentResult(2, "Saman", 60, 55, 50);

        student1.updateMark("math", 90);
        student1.updateMark("history", 70);

        System.out.println(student1.getResultSheet());
        System.out.println();

        System.out.println(student2.getResultSheet());
    }
}