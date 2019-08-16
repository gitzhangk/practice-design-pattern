package main.java.designpattern.builderpattern.service.impl;


import main.java.designpattern.builderpattern.service.Burger;

/**
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

