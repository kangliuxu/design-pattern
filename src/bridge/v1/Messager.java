package bridge.v1;

public interface Messager {
    //共有的
    void login();
    void sendMessage();
    void sendPicture();

    //平台特有的
    void playSound();
    void drawShape();
    void writeText();
    void connect();
}
