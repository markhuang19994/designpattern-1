package orca.DiscountShop;

public class Coffee extends Drink {
    public Coffee(double value) {
        super(value);
    }

    public Coffee(double value, IDiscountStrategy discountStrategy) {
        super(value, discountStrategy);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
