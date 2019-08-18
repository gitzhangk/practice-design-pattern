package main.java.designpattern.strategypattern.service.impl;

import main.java.designpattern.strategypattern.service.Strategy;

public class OperationMultiply implements Strategy {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}
