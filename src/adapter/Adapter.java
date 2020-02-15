package adapter;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void process() {
        adaptee.bar();
        adaptee.foo();
    }
}
