package core.operation;

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
        System.out.println("Przypisz ucznia podając numer: ");
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
        System.out.println("Czy chcesz wprowadzić kolejnego nauczyciela? (TAK/NIE) ");
    }
    public void showErrorMessage(){
        System.out.println("Sorry, przyjmuję tylko TAK lub NIE. ");
    }
    public void showErrorOutOFListMessage(){
        System.out.println("Sorry, podałeś indeks spoza listy. ");
    }

}
