package bridge.v2;

/**
 * 使用组合的方式，在运行时动态绑定平台类型，不用针对每个平台都写一个Lite实现
 */
public class MessagerLite implements Messager{
    MessagerImp messagerBase;

    public MessagerLite(MessagerImp mobileMessagerBase) {
        this.messagerBase = mobileMessagerBase;
    }

    public void login() {
        messagerBase.connect();
    }

    public void sendMessage() {
        messagerBase.writeText();
    }

    public void sendPicture() {
        messagerBase.drawShape();
    }
}
