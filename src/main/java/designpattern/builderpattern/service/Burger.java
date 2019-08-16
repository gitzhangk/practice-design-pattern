package main.java.designpattern.builderpattern.service;


import main.java.designpattern.builderpattern.service.impl.Wrapper;

/**
 * 汉堡
 */
public abstract class Burger implements Item {

    /**
     * 纸质包装
     * @return
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
