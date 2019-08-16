package main.java.designpattern.filterpattern.srvice.impl;

import main.java.designpattern.filterpattern.entity.Person;
import main.java.designpattern.filterpattern.srvice.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> malePersons = new ArrayList<Person>();
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("MALE")){
            malePersons.add(person);
         }
      }
      return malePersons;
   }
}