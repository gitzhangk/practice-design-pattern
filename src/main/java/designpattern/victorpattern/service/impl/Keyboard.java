package main.java.designpattern.victorpattern.service.impl;

import main.java.designpattern.victorpattern.service.ComputerPart;
import main.java.designpattern.victorpattern.service.ComputerPartVisitor;

public class Keyboard  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
