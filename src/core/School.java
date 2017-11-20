package core;

import core.human.*;
import core.operation.*;


import java.util.ArrayList;
import java.util.List;

public class School {

    List<Teacher> teacherList = new ArrayList<>();
    List<Parent> parentList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();

    public void mainMethod() {

        List<Parent> parents = new ArrayList<Parent>();

        addStudent(parents);
    }

    private void addTeacher() {

    }

    private List<Student> addStudent(List<Parent> parents){
        List<Student> students = new ArrayList<>();
        Display display = new Display();
        if(!parents.isEmpty()) {

            Input input = new Input();

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

}
