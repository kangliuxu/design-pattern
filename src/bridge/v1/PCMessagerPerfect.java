package bridge.v1;

/**
 * 完整版本，增加语音功能
 */
public class PCMessagerPerfect extends PCMessagerBase{
    @Override
    public void login() {
        super.playSound();
        super.connect();
    }

    @Override
    public void sendMessage() {
        super.playSound();
        super.writeText();
    }

    @Override
    public void sendPicture() {
        super.playSound();
        super.drawShape();
    }
}
