package singleton;

public class App {
    public static void main(String[] args) {
        System.out.println(SingletonDemo.getSingletonDemoWithDoubleLockAndVolatile());
        System.out.println(SingletonDemo.getInstance());
        System.out.println(SingletonDemo.getSingletonDemoWithDoubleLock());
        System.out.println(SingletonDemo.getInstanceWithLock());
    }
}
