package main.java.designpattern.victorpattern.service;

import main.java.designpattern.victorpattern.service.impl.Computer;
import main.java.designpattern.victorpattern.service.impl.Keyboard;
import main.java.designpattern.victorpattern.service.impl.Monitor;
import main.java.designpattern.victorpattern.service.impl.Mouse;

public interface ComputerPartVisitor {
   public void visit(Computer computer);
   public void visit(Mouse mouse);
   public void visit(Keyboard keyboard);
   public void visit(Monitor monitor);
}
