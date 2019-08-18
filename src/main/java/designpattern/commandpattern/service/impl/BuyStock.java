   package main.java.designpattern.commandpattern.service.impl;

import main.java.designpattern.commandpattern.service.Order;

public class BuyStock implements Order {
   private Stock abcStock;
 
   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.buy();
   }
}
