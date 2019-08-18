package main.test.designpattern.victorpattern;

import main.java.designpattern.victorpattern.service.ComputerPart;
import main.java.designpattern.victorpattern.service.impl.Computer;
import main.java.designpattern.victorpattern.service.impl.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
   public static void main(String[] args) {
 
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}
