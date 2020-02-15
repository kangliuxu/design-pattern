package adapter;

public class App {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.process();
    }
}
