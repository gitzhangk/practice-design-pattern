package main.java.designpattern.builderpattern.service.impl;


import main.java.designpattern.builderpattern.service.Burger;

/**
 * 素食汉堡
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

