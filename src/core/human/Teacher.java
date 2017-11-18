package core.human;

public class Teacher extends Human {
    private String subject;
    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }
}
