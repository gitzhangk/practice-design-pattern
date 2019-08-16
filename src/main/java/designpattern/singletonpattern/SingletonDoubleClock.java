package main.java.designpattern.singletonpattern;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class SingletonDoubleClock {
    private volatile static SingletonDoubleClock singleton;
    private SingletonDoubleClock (){}
    public static SingletonDoubleClock getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleClock.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleClock();
                }
            }
        }
        return singleton;
    }
}
