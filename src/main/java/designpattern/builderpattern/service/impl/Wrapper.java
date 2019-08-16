package main.java.designpattern.builderpattern.service.impl;


import main.java.designpattern.builderpattern.service.Packing;

/**
 * 纸质包装
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}

