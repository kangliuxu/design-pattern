package observer;

public class SohuObserver implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("搜狐新闻");
    }
}
