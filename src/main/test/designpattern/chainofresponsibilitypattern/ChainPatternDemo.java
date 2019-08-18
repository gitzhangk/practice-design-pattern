package main.test.designpattern.chainofresponsibilitypattern;

import main.java.designpattern.chainofresponsibilitypattern.AbstractLogger;
import main.java.designpattern.chainofresponsibilitypattern.ConsoleLogger;
import main.java.designpattern.chainofresponsibilitypattern.ErrorLogger;
import main.java.designpattern.chainofresponsibilitypattern.FileLogger;

/**
 * 顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，
 * 对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 *
 * 应用实例：
 *       1、JS 中的事件冒泡。
    *    2、JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。
 */
public class ChainPatternDemo {
   
   private static AbstractLogger getChainOfLoggers(){
 
      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
 
      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);
 
      return errorLogger;  
   }
 
   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();
 
      loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
 
      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is a debug level information.");
 
      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   }
}
