package main.test.designpattern.statepattern;

import main.java.designpattern.statepattern.service.impl.Context;
import main.java.designpattern.statepattern.service.impl.StartState;
import main.java.designpattern.statepattern.service.impl.StopState;

/**
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 *
 * 应用实例：
 *       1、打篮球的时候运动员可以有正常状态、不正常状态和超常状态。
 *       2、曾侯乙编钟中，'钟是抽象接口','钟A'等是具体状态，'曾侯乙编钟'是具体环境（Context）。
 */
public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();
 
      StartState startState = new StartState();
      startState.doAction(context);
 
      System.out.println(context.getState().toString());
 
      StopState stopState = new StopState();
      stopState.doAction(context);
 
      System.out.println(context.getState().toString());
   }
}
