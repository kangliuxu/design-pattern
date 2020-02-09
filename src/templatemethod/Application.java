package templatemethod;

public class Application extends Library {
    @Override
    protected boolean step2() {
        System.out.println("子类实现的步骤2执行了");
        return false;
    }

    @Override
    protected void step4() {
        System.out.println("我是子类实现的步骤4");
    }

    public static void main(String[] args) {
        Library library = new Application();
        library.run();
    }
}
