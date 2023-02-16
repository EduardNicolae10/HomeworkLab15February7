package Homework2PersonNameAndPhoneUsingList;

import Homework2PersonNameAndPhoneUsingList.Agenda;
import Homework2PersonNameAndPhoneUsingList.Person;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Person p = new Person("Ionel", "0727694748");
        Person p2 = new Person("Maria", "0746768555");
        Person p3 = new Person("Eduard","0788812312");

        agenda.addToAgenda(p);
        agenda.addToAgenda(p2);
        agenda.addToAgenda(p3);
        agenda.writeAll();
        agenda.delete(p3);



    }
}