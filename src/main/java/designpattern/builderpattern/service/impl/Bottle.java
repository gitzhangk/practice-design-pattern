package main.java.designpattern.builderpattern.service.impl;


import main.java.designpattern.builderpattern.service.Packing;

/**
 * 瓶装
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
