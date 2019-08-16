package main.java.designpattern.factorypattern.service.impl;

import main.java.designpattern.factorypattern.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
