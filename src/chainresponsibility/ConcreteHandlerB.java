package chainresponsibility;

public class ConcreteHandlerB extends Handler{

    public ConcreteHandlerB(Handler handler) {
        super(handler);
    }

    public ConcreteHandlerB() {
    }

    @Override
    protected void handleReqeust(String type) {
        if("B".equals(type)){
            System.out.println("处理器B 处理了请求");
            return;
        }
        sendNextHandler(type);
    }
}
