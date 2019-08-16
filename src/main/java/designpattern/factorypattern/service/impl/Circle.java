package main.java.designpattern.factorypattern.service.impl;

import main.java.designpattern.factorypattern.service.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
