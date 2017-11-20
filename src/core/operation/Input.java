package core.operation;

import core.human.Parent;

import java.util.List;
import java.util.Scanner;

public class Input {

    public String getInput(){
        //pobieranie danych od uzytkownika
        Scanner in = new Scanner(System.in);
        String input = in.next().toString();
        return input;
    }

    public boolean verifyIsEmpty(String input){
        // do sprawdzenia, czy podane dane nie sa puste
        //jeżeli jest pusta, to zwraca true, czyli w warunku trzeba zrobic if(!input.verifyIsEmpty)
        // -> wtedy wiemy, ze nie jest puste
        //mozna tu dodac displaya - jezli cos jest zle, to wysiwtl komunikat
        if(input.isEmpty()){
            return true;
        }
        else
            return false;
    }

    public boolean verifyAnswer(String input){
        //do sprawdzenia odpowiedzi na pytania, czy dodajemy kolejnego czlowieka
        //mozna tu dodac displaya - jezli cos jest zle, to wysiwtl komunikat
        //jezeli odpowiedz jest dobra, to zwraca true
        Display display = new Display();
        if(input.equals("TAK"))
            return true;
        else if(input.equals("NIE"))
            return true;
        else {
            display.showErrorMessage();
            return true;
        }
    }

    public boolean verifyIsNumber(String input){
        //do sprawdzenia tego, co poda uzytkownik przy wyborze rodzica
        //mozna tu dodac displaya - jezli cos jest zle, to wysiwtl komunikat
        String regex = "([0-9]+)";
        if(input.matches(regex)){
            return false;
        }
        else
            return true;
    }

    public boolean verifyNumber(String input, List<Parent> parents){
        //jeżeli ktos poda liczbe wieksza, niz jest do wyboru rodzicow, to zwraca true (czyli liczba jest za duza)
        //mozna tu dodac displaya - jezli cos jest zle, to wysiwtl komunikat
        Integer i=Integer.valueOf(input);

        if(i>parents.size())
            return true;
        else
            return false;


    }

    public boolean veryfiParentData(String input, List<Parent> parents){

        Display display=new Display();

        if(verifyIsEmpty(input)) {
            display.showErrorEmptyMessage();
            display.showLinkPupilWithParentMessage();
            display.displayParentList(parents);
            return true;
        }
        else if(verifyIsNumber(input)){
            display.showErrorNotANumber();
            display.showLinkPupilWithParentMessage();
            display.displayParentList(parents);
            return true;
        }
        else if(verifyNumber(input, parents)){
            display.showErrorOutOFListMessage();
            display.showLinkPupilWithParentMessage();
            display.displayParentList(parents);
            return true;
        }
        else
            return false;
    }
}



