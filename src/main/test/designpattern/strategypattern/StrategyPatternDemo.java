package main.test.designpattern.strategypattern;

import main.java.designpattern.strategypattern.service.impl.Context;
import main.java.designpattern.strategypattern.service.impl.OperationAdd;
import main.java.designpattern.strategypattern.service.impl.OperationMultiply;
import main.java.designpattern.strategypattern.service.impl.OperationSubstract;

/**
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。
 *
 * 应用实例：
 *       1、诸葛亮的锦囊妙计，每一个锦囊就是一个策略。
 *       2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。
 *       3、JAVA AWT 中的 LayoutManager
 */
public class StrategyPatternDemo {
   public static void main(String[] args) {

      Context context = new Context();
      context.setStrategy(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
      context.setStrategy(new OperationSubstract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
      context.setStrategy(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}
