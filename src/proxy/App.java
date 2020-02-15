package proxy;

public class App {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        subject.process();
        Proxy proxy = new Proxy(subject);
        proxy.process();
    }
}
