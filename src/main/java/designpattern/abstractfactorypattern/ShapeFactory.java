package main.java.designpattern.abstractfactorypattern;


import main.java.designpattern.abstractfactorypattern.servie.Color;
import main.java.designpattern.factorypattern.service.Shape;
import main.java.designpattern.factorypattern.service.impl.Circle;
import main.java.designpattern.factorypattern.service.impl.Rectangle;
import main.java.designpattern.factorypattern.service.impl.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
