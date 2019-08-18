package main.test.designpattern.abserverpattern;

import main.java.designpattern.abserverpattern.BinaryObserver;
import main.java.designpattern.abserverpattern.HexaObserver;
import main.java.designpattern.abserverpattern.OctalObserver;
import main.java.designpattern.abserverpattern.Subject;

/**
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象
 *
 * 应用实例：
 *       1、拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。
 *       2、西游记里面悟空请求菩萨降服红孩儿，菩萨洒了一地水招来一个老乌龟，这个乌龟就是观察者，他观察菩萨洒水这个动作。
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();
 
      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);
 
      System.out.println("First state change: 15");   
      subject.setState(15);
      System.out.println("Second state change: 10");  
      subject.setState(10);
   }
}
