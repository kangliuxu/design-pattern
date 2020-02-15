package proxy;

public class RealSubject implements Subject{
    @Override
    public void process() {
        System.out.println("查询数据");
    }
}
