package decorator;

public class Decorator implements Stream{
    protected Stream stream;

    public Decorator(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void read() {
        stream.read();
    }
}
