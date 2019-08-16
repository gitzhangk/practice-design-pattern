package main.java.designpattern.adapterpattern.service.impl;

import main.java.designpattern.adapterpattern.service.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);      
   }
 
   @Override
   public void playMp4(String fileName) {
      //什么也不做
   }
}
