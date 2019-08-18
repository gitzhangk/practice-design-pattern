package main.java.designpattern.facadepattern.service.impl;

import main.java.designpattern.facadepattern.service.Shape;

public class Rectangle implements Shape  {
 
   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}
