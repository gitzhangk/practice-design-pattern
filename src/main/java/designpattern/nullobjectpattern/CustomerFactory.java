package main.java.designpattern.nullobjectpattern;

import main.java.designpattern.nullobjectpattern.service.AbstractCustomer;
import main.java.designpattern.nullobjectpattern.service.impl.NullCustomer;
import main.java.designpattern.nullobjectpattern.service.impl.RealCustomer;

public class CustomerFactory {
   
   public static final String[] names = {"Rob", "Joe", "Julie"};
 
   public static AbstractCustomer getCustomer(String name){
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealCustomer(name);
         }
      }
      return new NullCustomer();
   }
}
