package factorymethod.v2;

public class TextSplitterFactory implements SplitterFactory{
    /**
     * 将对象的创建延迟到子类
     * @return
     */
    @Override
    public Isplitter createSplitter() {
        return new TextSplitter();
    }
}
