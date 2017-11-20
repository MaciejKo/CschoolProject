package core.human;

public class Student extends Human {
    private String studentClass;
    private Integer parentNumber;

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Integer getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(Integer parentNumber) {
        this.parentNumber = parentNumber;
    }

    public Student(String firstName, String lastName, String studentClass, Integer parentNumber) {
        super(firstName, lastName);
        this.studentClass = studentClass;
        this.parentNumber=parentNumber;
    }

    }
