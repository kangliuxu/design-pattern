package bridge.v2;

/**
 * 平台实现
 */
public abstract class PCMessagerBase implements MessagerImp {
    @Override
    public void playSound() {
        System.out.println("pc基本实现:播放声音");
    }

    @Override
    public void drawShape() {
        System.out.println("pc基本实现:画图");
    }

    @Override
    public void writeText() {
        System.out.println("pc基本实现:写文本");
    }

    @Override
    public void connect() {
        System.out.println("pc基本实现:连接");
    }
}
