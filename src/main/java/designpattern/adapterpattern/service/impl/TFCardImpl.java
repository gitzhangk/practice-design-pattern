package main.java.designpattern.adapterpattern.service.impl;

import main.java.designpattern.adapterpattern.service.TFCard;

/**
 * TF卡实现类
 */
public class TFCardImpl implements TFCard {
    @Override    
    public String readTF() {        
        String msg ="tf card reade msg : hello word tf card";        
        return msg;    
    }    
    @Override    
    public int writeTF(String msg) {        
        System.out.println("tf card write a msg : " + msg);        
        return 1;    
    }
}