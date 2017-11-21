package core.operation;

import core.human.Parent;
import core.human.Teacher;

import java.util.List;

public class Display {

    public void showEnterMessage(){
        System.out.println("Witam w aplikacji Szkoła!");
    }
    public void showNewTeacher(){
        System.out.println("Podaj nauczycieli: ");
    }
    public void showNewPupil(){
        System.out.println("Podaj uczniów: ");
    }
    public void showPupilsCounter(int counter){
        System.out.println("Uczen "+ counter + " z 3");
    }
    public void showNewParent(int count){
        System.out.println("Podaj rodziców: (" + (count+1) + "/3)");
    }

    public void showTeachersCounter(int counter) {
        System.out.println("Nauczyciel " + counter + "/3");
    }
    public void showNewParent(){
        System.out.println("Podaj rodziców: ");
    }
    public void showFirstnameMessage(){
        System.out.println("Podaj imię: ");
    }
    public void showLastnameMessage(){
        System.out.println("Podaj nazwisko: ");
    }
    public void showSubjectMessage(){
        System.out.println("Podaj przedmiot: ");
    }
    public void showProfessionMessage(){
        System.out.println("Podaj zawód: ");
    }
    public void showPupilClassMessage(){
        System.out.println("Podaj klasę: ");
    }
    public void showLinkPupilWithParentMessage(){
        System.out.println("Przypisz rodzica podając numer z listy: ");
    }
    public void showResultMessage(){
        System.out.println("Rezultat: ");
    }
    public void showNewTeacherMessage(){
        System.out.println("Czy chcesz wprowadzić kolejnego nauczyciela? (TAK/NIE) ");
    }
    public void showNewPupilMessage(){
        System.out.println("Czy chcesz wprowadzić kolejnego ucznia? (TAK/NIE) ");
    }
    public void showNewParentMessage(){
        System.out.println("Czy chcesz wprowadzić kolejnego rodzica? (TAK/NIE) ");
    }
    public void showErrorMessage(){
        System.out.println("Sorry, przyjmuję tylko TAK lub NIE. ");
    }
    public void showErrorOutOFListMessage(){
        System.out.println("Sorry, podałeś indeks spoza listy. ");
    }
    public void showErrorEmptyMessage(){
            System.out.println("Podana wartość jest pusta.");
    }
    public void showErrorNotANumber(){
    System.out.println("Podana wartość nie jest liczbą.");
}
    public void displayParentList(List<Parent> parents){
        for(Parent par:parents){
            System.out.println((parents.indexOf(par)+1) + ". "+ par.getFirstName() + " " + par.getLastName());
        }
    }

    public void showErrorEmptyParentList(){
        System.out.println("Lista rodziców jest pusta!");
    }
    public void showParent(int number, String Nazwisko){
        System.out.println(number + "." + Nazwisko);
    }

    public void showTeacherlist(List<Teacher> teacherList) {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getSubject());
        }
    }
}
