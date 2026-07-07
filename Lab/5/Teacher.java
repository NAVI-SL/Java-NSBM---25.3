public class Teacher {
    private String name;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        teacher.setName("David");
        teacher.setSubject("Java");

        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Subject: " + teacher.getSubject());
    }
}
