package main.java.designpattern.abstractfactorypattern;

import main.java.designpattern.abstractfactorypattern.servie.Color;
import main.java.designpattern.factorypattern.service.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
