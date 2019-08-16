package main.java.designpattern.adapterpattern.service.impl;

import main.java.designpattern.adapterpattern.service.SDCard;
import main.java.designpattern.adapterpattern.service.TFCard;

/**
 * 创建SD适配TF （也可以说是SD兼容TF，相当于读卡器）
 */
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard) {        
        this.tfCard = tfCard;    
    }    
    @Override    
    public String readSD() {        
        System.out.println("adapter read tf card ");        
        return tfCard.readTF();    
    }    
    @Override    
    public int writeSD(String msg) {        
        System.out.println("adapter write tf card");        
        return tfCard.writeTF(msg);    
    }
}