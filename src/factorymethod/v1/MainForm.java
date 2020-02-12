package factorymethod.v1;

/**
 * 文件分割器窗口
 */
public class MainForm {

    public void buttonClick(){
        //虽然变量声明使用了接口，但是使用new的方式是编译时依赖，也是一个紧耦合，不符合开闭原则
        Isplitter isplitter = new BinarySplitter();
        isplitter.splitter();
    }
}
