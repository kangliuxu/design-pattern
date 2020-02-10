package decorator;

public class BufferdStream extends Decorator{
    public BufferdStream(Stream stream) {
        super(stream);
    }

    @Override
    public void read() {
        stream.read();
        System.out.println("缓冲流");
    }
}
