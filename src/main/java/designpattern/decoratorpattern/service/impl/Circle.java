package main.java.designpattern.decoratorpattern.service.impl;

import main.java.designpattern.decoratorpattern.service.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}
