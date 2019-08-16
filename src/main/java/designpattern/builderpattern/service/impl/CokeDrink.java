package main.java.designpattern.builderpattern.service.impl;


import main.java.designpattern.builderpattern.service.Drink;

public class CokeDrink extends Drink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
