package main.java.designpattern.commandpattern.service.impl;

import main.java.designpattern.commandpattern.service.Order;

public class SellStock implements Order {
   private Stock abcStock;
 
   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.sell();
   }
}
