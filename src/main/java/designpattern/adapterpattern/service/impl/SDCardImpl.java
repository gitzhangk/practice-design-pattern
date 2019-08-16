package main.java.designpattern.adapterpattern.service.impl;

import main.java.designpattern.adapterpattern.service.SDCard;

/**
 * SD卡实现类
 */
public class SDCardImpl implements SDCard {
    @Override    
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;  
    }
    @Override  
    public int writeSD(String msg) {      
        System.out.println("sd card write msg : " + msg);    
        return 1;   
    }
}