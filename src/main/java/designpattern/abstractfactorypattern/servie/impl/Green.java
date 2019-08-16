package main.java.designpattern.abstractfactorypattern.servie.impl;


import main.java.designpattern.abstractfactorypattern.servie.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
