package factorymethod.v2;

public interface SplitterFactory {
    /**
     * 创建文件分割器
     * @return
     */
    Isplitter createSplitter();
}
