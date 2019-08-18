package main.test.designpattern.templatepattern;

import main.java.designpattern.templatepattern.service.Game;
import main.java.designpattern.templatepattern.service.impl.Cricket;
import main.java.designpattern.templatepattern.service.impl.Football;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行
 *
 * 应用实例：
 *       1、在造房子的时候，地基、走线、水管都一样，只有在建筑的后期才有加壁橱加栅栏等差异。
 *       2、西游记里面菩萨定好的 81 难，这就是一个顶层的逻辑骨架。
 *       3、spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，比如开启事务、获取 Session、关闭 Session 等，
 *          程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。
 */
public class TemplatePatternDemo {
   public static void main(String[] args) {
 
      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();      
   }
}
