package decorator;


public class App {
    public static void main(String[] args) {
        Stream fileStream = new FileStream();
        Decorator encryStream =  new EncryStream(fileStream);
        BufferdStream bufferdStream = new BufferdStream(encryStream);
        bufferdStream.read();
    }
}
