package main.test.designpattern.bridgepattern;

import main.java.designpattern.bridgepattern.srevice.Shape;
import main.java.designpattern.bridgepattern.srevice.impl.Circle;
import main.java.designpattern.bridgepattern.srevice.impl.GreenCircle;
import main.java.designpattern.bridgepattern.srevice.impl.RedCircle;

/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，
 * 它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 */
public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}
