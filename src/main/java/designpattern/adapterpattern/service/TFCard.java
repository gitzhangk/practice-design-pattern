package main.java.designpattern.adapterpattern.service;

/**
 * TF卡接口
 */
public interface TFCard {
    String readTF();    
    int writeTF(String msg);
}