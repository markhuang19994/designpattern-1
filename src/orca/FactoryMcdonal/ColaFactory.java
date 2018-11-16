package orca.FactoryMcdonal;

public class ColaFactory implements Factory {
    @Override
    public Product getProduct() {
        return new CocaCola();
    }
}
