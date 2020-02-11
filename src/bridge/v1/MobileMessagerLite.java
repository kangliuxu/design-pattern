package bridge.v1;


public class MobileMessagerLite extends MobileMessagerBase{
    @Override
    public void login() {
        super.connect();
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
