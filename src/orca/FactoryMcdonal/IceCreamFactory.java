package orca.FactoryMcdonal;

public class IceCreamFactory implements Factory {
    @Override
    public Product getProduct() {
        return new IceCream();
    }
}
