package core;

import core.human.Parent;
import core.human.Student;
import core.human.Teacher;
import core.operation.Display;
import core.operation.Input;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Teacher> teacherList = new ArrayList<>();
    List<Parent> parentList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();
    Display display = new Display();
    Input input = new Input();

    public void mainMethod() {
        addAllTeachers();
        addAllParents();
        addStudent(parentList);
    }

    private void addTeacher() {
        display.showFirstnameMessage();
        String firstName = input.getInput();
        if (input.verifyIsEmpty(firstName)) {
            display.showErrorEmptyMessage();
        }

        display.showLastnameMessage();
        String lastName = input.getInput();
        if (input.verifyIsEmpty(lastName)) {
            display.showErrorEmptyMessage();
        }
        display.showSubjectMessage();
        String subject = input.getInput();
        if (input.verifyIsEmpty(subject)) {
            display.showErrorEmptyMessage();
        }
        Teacher teacher = new Teacher(firstName, lastName, subject);
        teacherList.add(teacher);
    }

    private void addAllTeachers() {
        boolean iterate = true;
        display.showNewTeacher();
        while (iterate) {
            addTeacher();
            display.showTeachersCounter(teacherList.size());
            display.showNewTeacherMessage(); //"Czy chcesz wprowadzić kolejnego nauczyciela? (TAK/NIE) "
            //weryfikuje tak czy nie

            if (!input.verifyAnswer()) {   //! = not
                iterate = false;
            }
        }
        display.showTeacherlist(teacherList);
    }



    private List<Student> addStudent(List<Parent> parents){
        List<Student> students = new ArrayList<>();
        if(!parents.isEmpty()) {

            display.showNewPupil();

            //dodawanie trzech wymaganych uczniów
            for (int i = 0; i < 3; i++) {
                display.showPupilsCounter((i + 1));
                students.add(getStudentData(display, input, parents));
            }

            //pytanie o kolejnych uczniow
            display.showNewPupilMessage();
            String answer = input.getInput();
            boolean next = true;
            while (next) {
                if (answer.equals("NIE")) {
                    next = false;
                } else if (answer.equals("TAK")) {
                    //dodawanie kolejnego ucznia
                    students.add(getStudentData(display, input, parents));
                    //pytanie, czy dodajemy nastepnego
                    display.showNewPupilMessage();
                    answer = input.getInput();
                    next = true;
                } else {
                    //jezeli bedzie inna odpowiedz niz wymagana
                    display.showErrorMessage();
                    display.showNewPupilMessage();
                    answer = input.getInput();
                    next = true;
                }
            }
        }
        else
            display.showErrorEmptyParentList();

        return students;
    }

    private Student getStudentData(Display display, Input input, List<Parent> parents){

        String firstName=new String();
        String lastName=new String();
        String studentClass=new String();
        String parentNumber=new String();

        display.showFirstnameMessage();
        firstName = input.getInput();
        while(input.verifyIsEmpty(firstName)) {
            display.showFirstnameMessage();
            firstName=input.getInput();
        }

        display.showLastnameMessage();
        lastName=input.getInput();
        while(input.verifyIsEmpty(lastName)){
            display.showLastnameMessage();
            lastName=input.getInput();
        }

        display.showPupilClassMessage();
        studentClass=input.getInput();
        while(input.verifyIsEmpty(studentClass)){
            display.showPupilClassMessage();
            studentClass=input.getInput();
        }

        display.showLinkPupilWithParentMessage();
        display.displayParentList(parents);
        parentNumber=input.getInput();
        while(input.veryfiParentData(parentNumber, parents)){
            parentNumber=input.getInput();
        }

        Student student = new Student(firstName, lastName, studentClass, (Integer.valueOf(parentNumber)-1));

        return student;
    }

    private void addParent(){
        Parent rodzic = new Parent();
        String userInput = "";
        Display display = new Display();
        Input input = new Input();

        display.showNewParent(parentList.size());

        // podaj imię
        while(userInput.isEmpty()){
            display.showFirstnameMessage();
            userInput = input.readString();
        }
        rodzic.setFirstName(userInput);
        userInput = "";

        // podaj nazwisko
        while(userInput.isEmpty()){
            display.showLastnameMessage();
            userInput = input.readString();
        }
        rodzic.setLastName(userInput);
        userInput = "";

        // podaj zawód
        while(userInput.isEmpty()){
            display.showProfessionMessage();
            userInput = input.readString();
        }
        rodzic.setProfession(userInput);

        parentList.add(rodzic);
    }

    public void addAllParents(){
        boolean isAnotherParentRequired = true;

        while (parentList.size()<3){
            addParent();
        }

        while(isAnotherParentRequired) {

            display.showNewParentMessage();

            while(true) {
                String userInput = input.readString();

                if(userInput.equalsIgnoreCase("TAK")){
                    addParent();
                    break;
                }
                else if(userInput.equalsIgnoreCase("NIE")) {
                    isAnotherParentRequired = false;
                    break;
                }
                else {
                    display.showErrorMessage();
                }
            }
        }
    }

}
