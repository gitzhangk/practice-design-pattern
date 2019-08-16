package main.java.designpattern.abstractfactorypattern.servie.impl;


import main.java.designpattern.abstractfactorypattern.servie.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

