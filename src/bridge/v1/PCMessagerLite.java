package bridge.v1;

/**
 * 使用继承使得代码结构在编译时已经决定具体的实现类，无法实现动态绑定，需要针对每一个平台实现一个功能
 */
public class PCMessagerLite extends PCMessagerBase{
    @Override
    public void login() {
        super.connect();
        System.out.println("pc精简版登录");
    }

    @Override
    public void sendMessage() {
        super.writeText();
    }

    @Override
    public void sendPicture() {
        super.drawShape();
    }
}
