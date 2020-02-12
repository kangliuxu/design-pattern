package factorymethod.v1;

public class TextSplitter implements Isplitter {
    @Override
    public void splitter() {
        System.out.println("文本分割器");
    }
}
