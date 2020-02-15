package chainresponsibility;

public class ConcreteHandlerA extends Handler{

    public ConcreteHandlerA(Handler handler) {
        super(handler);
    }

    public ConcreteHandlerA() {
    }

    @Override
    protected void handleReqeust(String type) {
        if("A".equals(type)){
            System.out.println("处理器A 处理了请求");
            return;
        }
        sendNextHandler(type);
    }
}
