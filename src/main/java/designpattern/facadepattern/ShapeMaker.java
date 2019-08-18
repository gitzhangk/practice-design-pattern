package main.java.designpattern.facadepattern;


import main.java.designpattern.facadepattern.service.Shape;
import main.java.designpattern.facadepattern.service.impl.Circle;
import main.java.designpattern.facadepattern.service.impl.Rectangle;
import main.java.designpattern.facadepattern.service.impl.Square;

/**
 * 外观类
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
 
   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }
 
   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}
