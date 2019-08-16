package main.java.designpattern.singletonpattern;

/**
 * 饿汉式，线程安全
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class SingletonHungrySave {
    private static SingletonHungrySave instance = new SingletonHungrySave();
    private SingletonHungrySave (){}
    public static SingletonHungrySave getInstance() {
        return instance;
    }
}
