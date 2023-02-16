package Homework2PersonNameAndPhoneUsingList;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
   private final List<Person> agenda = new ArrayList<>();

   public void addToAgenda(Person p){
      agenda.add(p);
   }

   public void writeAll(){
      for(Person s: agenda){
         System.out.println(s);
      }
   }

   public void searchInAgenda(Person person){
      Boolean personExist = agenda.contains(person);
      System.out.println("if the person was find "  + personExist);
   }

   public void delete(Person person){
      for(int i=0;i<agenda.size();i++){
         if(person==agenda.get(i))
            agenda.remove(person);
      }
      writeAll();
   }

   public void replace(Person currentPerson, Person person){
      for(int i=0; i < agenda.size(); i++){
         if(agenda.get(i).equals(currentPerson)){
            agenda.set(i,person);
         }
      }
      writeAll();
   }


}
