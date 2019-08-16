package main.java.designpattern.bridgepattern.srevice.impl;

import main.java.designpattern.bridgepattern.srevice.DrawAPI;
import main.java.designpattern.bridgepattern.srevice.Shape;

public class Circle extends Shape {
   private int x, y, radius;
 
   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }
 
   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}
