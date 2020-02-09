package strategy;

public class USTax implements ITax{
    @Override
    public void caculate() {
        System.out.println("美国税法计算");
    }
}
