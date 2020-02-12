package factorymethod.v2;

/**
 * 文件分割器窗口
 */
public class MainForm {

    private SplitterFactory splitterFactory;

    public MainForm(SplitterFactory splitterFactory) {
        this.splitterFactory = splitterFactory;
    }

    public void buttonClick(){
        //这里使用工厂方法来创建实例对象，以后如果要更改文件分割器，只需要在运行时修改工厂对象即可，本文件代码不需要更改，
        //符合开闭原则，
        Isplitter isplitter = splitterFactory.createSplitter();
        isplitter.splitter();
    }
}
