package main.java.designpattern.statepattern.service.impl;

import main.java.designpattern.statepattern.service.State;

public class StopState implements State {
 
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Stop State";
   }
}
