package Homework3PersonNameAndPhoneUsingHashtable;

import Homework2PersonNameAndPhoneUsingList.Person;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class AgendaPersoane {

    private Map<String, Persoana> agendaPersoane = new HashMap<>();

    public void addToAgenda(String k, Persoana p){
        agendaPersoane.put(k,p);
    }

    public void writeAll(){
        for(HashMap.Entry<String,Persoana> Ag : agendaPersoane.entrySet())
        System.out.println(Ag.getKey() + " " + Ag.getValue());
    }

    public void delete(){

    }
}


