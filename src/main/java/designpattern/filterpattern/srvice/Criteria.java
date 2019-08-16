package main.java.designpattern.filterpattern.srvice;

import main.java.designpattern.filterpattern.entity.Person;

import java.util.List;

public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}