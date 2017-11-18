package core;

import core.*;
import core.human.Parent;
import core.operation.Display;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    private Display display = new Display();

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
        if(input.equals("Tak"))
            return true;
        else if(input.equals("Nie"))
            return true;
        else
            return false;
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

    public boolean verifyNumber(String input, ArrayList<Parent> parentList){
        //jeżeli ktos poda liczbe wieksza, niz jest do wyboru rodzicow, to zwraca true (czyli liczba jest za duza)
        //mozna tu dodac displaya - jezli cos jest zle, to wysiwtl komunikat
        Integer i=Integer.valueOf(input);

        if(i>parentList.size())
            return true;
        else
            return false;


    }
}



