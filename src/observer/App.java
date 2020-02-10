package observer;

public class App {
    public static void main(String[] args) {
        News news = new SinaNews();
        news.subscribe(new SinaObserver());
        news.subscribe(new SohuObserver());
        news.notifyA();
    }
}
