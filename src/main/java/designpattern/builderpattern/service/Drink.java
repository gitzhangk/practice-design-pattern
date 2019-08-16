package main.java.designpattern.builderpattern.service;


import main.java.designpattern.builderpattern.service.impl.Bottle;

/**
 * 饮料
 */
public abstract class Drink implements Item {

    /**
     * 瓶装
     * @return
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

