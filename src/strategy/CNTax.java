package strategy;

public class CNTax implements ITax{
    @Override
    public void caculate() {
        System.out.println("中国税法计算");
    }
}
