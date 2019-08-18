package main.test.designpattern.proxypattern;

import main.java.designpattern.proxypattern.service.Image;
import main.java.designpattern.proxypattern.service.impl.ProxyImage;

/**
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 *
 * 应用实例：
 *    1、Windows 里面的快捷方式。
 *    2、买火车票不一定在火车站买，也可以去代售点。
 *    3、spring aop。
 */
public class ProxyPatternDemo {
   
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
 
      // 图像将从磁盘加载
      image.display(); 
      System.out.println("");
      // 图像不需要从磁盘加载
      image.display();  
   }
}
