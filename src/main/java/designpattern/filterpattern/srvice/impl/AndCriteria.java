package main.java.designpattern.filterpattern.srvice.impl;

import main.java.designpattern.filterpattern.entity.Person;
import main.java.designpattern.filterpattern.srvice.Criteria;

import java.util.List;

public class AndCriteria implements Criteria {
 
   private Criteria criteria;
   private Criteria otherCriteria;
 
   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);     
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}