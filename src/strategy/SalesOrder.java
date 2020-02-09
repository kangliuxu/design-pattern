package strategy;

public class SalesOrder {
    private ITax itax;
    SalesOrder(ITax itax){
        this.itax = itax;
    }

    public void executeSales(){
        this.itax.caculate();
    }

    public static void main(String[] args) {
        new SalesOrder(new USTax()).executeSales();
    }

}
