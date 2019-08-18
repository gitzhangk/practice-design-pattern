package main.test.designpattern.mediatorpattern;

import main.java.designpattern.mediatorpattern.entity.User;

/**
 *    中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 *    这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式
 *
 *    应用实例：
 *       1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。
 *       2、机场调度系统。
 *       3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
 */
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");
 
      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}
