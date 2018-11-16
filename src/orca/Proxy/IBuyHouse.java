package orca.Proxy;

public interface IBuyHouse {

//    找適合的房子
    public void findHouse();

//    跟屋主說太貴
    public void priceTooHigh();

//    屋主防禦價錢
    public void defendPrice();

//    成交後，簡化從付訂金到交屋的過程。
    public void finish();

}
