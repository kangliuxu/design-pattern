package decorator;

public class EncryStream extends Decorator{

    public EncryStream(Stream stream) {
        super(stream);
    }

    @Override
    public void read() {
        stream.read();
        System.out.println("加密");
    }
}
