package observer;

public class SinaObserver implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("新浪新闻");
    }
}
