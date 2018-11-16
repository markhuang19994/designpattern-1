package orca.DrinkShop;

public class TeaFactory implements Factory {
    @Override
    public Drink getDrink(Drink.SugarType sugarType, Drink.IceType iceType) {
        return new Tea(sugarType,iceType);
    }
}
