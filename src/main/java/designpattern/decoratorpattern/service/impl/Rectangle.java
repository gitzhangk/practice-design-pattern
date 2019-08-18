package main.java.designpattern.decoratorpattern.service.impl;

import main.java.designpattern.decoratorpattern.service.Shape;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}
