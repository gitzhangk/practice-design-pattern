package main.java.designpattern.strategypattern.service.impl;

import main.java.designpattern.strategypattern.service.Strategy;

public class Context {
   private Strategy strategy;
   public Context(){
   }
   public void setStrategy(Strategy strategy){
      this.strategy = strategy;
   }
   public Context(Strategy strategy){
      this.strategy = strategy;
   }
 
   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
