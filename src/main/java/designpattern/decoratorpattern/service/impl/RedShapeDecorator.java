package main.java.designpattern.decoratorpattern.service.impl;

import main.java.designpattern.decoratorpattern.service.Shape;
import main.java.designpattern.decoratorpattern.service.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
 
   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);     
   }
 
   @Override
   public void draw() {
      decoratedShape.draw();         
      setRedBorder(decoratedShape);
   }
 
   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}
