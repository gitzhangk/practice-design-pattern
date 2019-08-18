package main.java.designpattern.statepattern.service.impl;

import main.java.designpattern.statepattern.service.State;

public class Context {
   private State state;
 
   public Context(){
      state = null;
   }
 
   public void setState(State state){
      this.state = state;     
   }
 
   public State getState(){
      return state;
   }
}
