package orca.FactoryMcdonal;

public class FrenchFriesFactory implements Factory {
    @Override
    public Product getProduct() {
        return new FrenchFries();
    }

    public Product getProduct(String state) {
        return new FrenchFries(state);
    }
}
