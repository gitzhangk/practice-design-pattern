package main.java.designpattern.builderpattern.service.impl;


import main.java.designpattern.builderpattern.service.Drink;

public class MilkDrink extends Drink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Milk";
    }
}

