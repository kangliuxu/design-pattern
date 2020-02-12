package factorymethod.v2;

public class BinarySplitterFactory implements SplitterFactory{
    /**
     * 将对象的创建延迟到子类
     * @return
     */
    @Override
    public Isplitter createSplitter() {
        return new BinarySplitter();
    }
}
