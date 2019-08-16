package main.java.designpattern.filterpattern.srvice.impl;

import main.java.designpattern.filterpattern.entity.Person;
import main.java.designpattern.filterpattern.srvice.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> femalePersons = new ArrayList<Person>();
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("FEMALE")){
            femalePersons.add(person);
         }
      }
      return femalePersons;
   }
}