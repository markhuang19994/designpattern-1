package orca.DrinkShop;

public interface Factory {
    public Drink getDrink(Drink.SugarType sugarType,Drink.IceType iceType);
}
