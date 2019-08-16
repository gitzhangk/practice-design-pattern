package main.java.designpattern.singletonpattern;

/**
 * 懒汉式，线程不安全，在多线程不能正常工作
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 */

public class SingletonIdlerUnSave {

    private static SingletonIdlerUnSave instance;
    private SingletonIdlerUnSave (){}

    public static SingletonIdlerUnSave getInstance() {
        if (instance == null) {
            instance = new SingletonIdlerUnSave();
        }
        return instance;
    }
}
