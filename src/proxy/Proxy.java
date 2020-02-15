package proxy;

/**
 * 记录日志操作
 */
public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void process() {
        System.out.println("代理对象记录日志");
        subject.process();
        System.out.println("代理对象记录结束");
    }
}
