package Homework3PersonNameAndPhoneUsingHashtable;

public class Princ {
    public static void main(String[] args) {

        AgendaPersoane agendaPersoane = new AgendaPersoane();

        Persoana p1 = new Persoana("07123123123", "0242 231232");
        Persoana p2 = new Persoana("07231231231", "0242 122312");
        Persoana p3 = new Persoana("0726345632","0242 322342");

        agendaPersoane.addToAgenda("Ionel",p1);
        agendaPersoane.addToAgenda("Maria",p2);
        agendaPersoane.addToAgenda("Costel",p3);
        agendaPersoane.writeAll();
        

    }
}
