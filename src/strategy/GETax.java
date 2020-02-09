package strategy;

public class GETax implements ITax{
    @Override
    public void caculate() {
        System.out.println("德国税法计算");
    }
}
