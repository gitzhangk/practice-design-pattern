package main.java.designpattern.adapterpattern.service;

/**
 * 计算机接口，提供读取SD卡方法
 */
public interface Computer {
    String readSD(SDCard sdCard);
}