package main.java.designpattern.adapterpattern.service.impl;

import main.java.designpattern.adapterpattern.service.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
 
   @Override
   public void playVlc(String fileName) {
      //什么也不做
   }
 
   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);      
   }
}
