package chainresponsibility;

public class App {
    public static void main(String[] args) {
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerA = new ConcreteHandlerA();
        handlerA.setNextHandler(handlerB);
        handlerA.handleReqeust("B");
    }
}
