package composite;

public class App {
    public static void main(String[] args) {
        Composite root = new Composite("root") ;
        Composite compositeNode1 = new Composite("compositeNode1");
        Composite compositeNode2 = new Composite("compositeNode2");
        Component leaf1 =  new Leaf("leaf1");
        Component leaf2 =  new Leaf("leaf2");

        compositeNode1.add(leaf1);
        compositeNode2.add(leaf2);
        root.add(compositeNode1);
        root.add(compositeNode2);
        //组合模式使得不同类型的组件可以使用一致的接口进行处理

        root.operation();

        leaf1.operation();

    }
}
