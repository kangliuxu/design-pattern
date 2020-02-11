package bridge.v2;

/**
 * 完整版本，增加语音功能
 */
public class MessagerPerfect implements Messager{
    MessagerImp messagerImp;

    public MessagerPerfect(MessagerImp messagerImp) {
        this.messagerImp = messagerImp;
    }

    @Override
    public void login() {
        messagerImp.playSound();
        messagerImp.connect();
    }

    @Override
    public void sendMessage() {
        messagerImp.playSound();
        messagerImp.writeText();
    }

    @Override
    public void sendPicture() {
        messagerImp.playSound();
        messagerImp.drawShape();
    }
}
