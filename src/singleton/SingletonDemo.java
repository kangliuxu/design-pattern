package singleton;

import sun.security.jca.GetInstance;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式
 * 最主要的一个地方就是私有化构造器
 */
public class SingletonDemo {

    private static SingletonDemo singletonDemo;

    private static volatile SingletonDemo volatileSingletonDemo;

    private SingletonDemo() {
    }

    /**
     * 单线程模式
     */
    public static SingletonDemo getInstance(){
        if(singletonDemo == null){
            singletonDemo =  new SingletonDemo();
        }
        return singletonDemo;
    }

    /**
     * 多线程加锁模式，性能不高
     */
    public static synchronized  SingletonDemo getInstanceWithLock(){
        if(singletonDemo == null){
            singletonDemo = new SingletonDemo();
        }
        return singletonDemo;
    }

    /**
     * 高并发下性能优化，双重检查锁机制
     * tips: 这样会存在重排序问题，可能会得到没有正确初始化的实例
     */
    public static SingletonDemo getSingletonDemoWithDoubleLock(){
        //外层判断，只需要在实例为空的情况下进行加锁创建实例
        if(singletonDemo == null){
            Lock lock = new ReentrantLock();
            lock.tryLock();
            //里层判断，防止创建多个实例
            if(singletonDemo == null){
                singletonDemo = new SingletonDemo();
            }
            lock.unlock();
        }
        return singletonDemo;
    }

    /**
     * 解决双重检查锁机制指令重排序问题
     */
    public static SingletonDemo getSingletonDemoWithDoubleLockAndVolatile(){
        //外层判断，只需要在实例为空的情况下进行加锁创建实例
        if(volatileSingletonDemo == null){
            Lock lock = new ReentrantLock();
            lock.tryLock();
            //里层判断，防止创建多个实例
            if(volatileSingletonDemo == null){
                volatileSingletonDemo = new SingletonDemo();
            }
            lock.unlock();
        }
        return volatileSingletonDemo;
    }

}
