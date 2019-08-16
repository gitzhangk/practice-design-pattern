package main.java.designpattern.abstractfactorypattern;


import main.java.designpattern.abstractfactorypattern.servie.Color;
import main.java.designpattern.abstractfactorypattern.servie.impl.Blue;
import main.java.designpattern.abstractfactorypattern.servie.impl.Green;
import main.java.designpattern.abstractfactorypattern.servie.impl.Red;
import main.java.designpattern.factorypattern.service.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
