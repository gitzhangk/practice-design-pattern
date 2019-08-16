package main.java.designpattern.builderpattern.service;

/**
 * 商品
 */
public interface Item {
    /**
     * 商品名
     * @return
     */
    public String name();

    /**
     * 包装
     * @return
     */
    public Packing packing();

    /**
     * 价格
     * @return
     */
    public float price();
}

