package chainresponsibility;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler() {
    }

    protected abstract void handleReqeust(String type);

    protected void sendNextHandler(String type){
        if(nextHandler!=null){
            nextHandler.handleReqeust(type);
        }
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
