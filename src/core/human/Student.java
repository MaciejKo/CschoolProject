package core.human;

public class Student extends Human {
    private String studentClass;

    public Student(String firstName, String lastName, String studentClass) {
        super(firstName, lastName);
        this.studentClass = studentClass;
    }

    }
