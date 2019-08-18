package main.test.designpattern.iteractorpattern;

import main.java.designpattern.iteractorpattern.service.Iterator;
import main.java.designpattern.iteractorpattern.service.impl.NameRepository;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 *  这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 *
 *  应用实例：JAVA 中的 iterator
 */
public class IteratorPatternDemo {
   
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();
 
      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }  
   }
}
