package orca.DrinkShop;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test(){
        DrinkShop drinkShop = new DrinkShop();
        Tea tea = (Tea)drinkShop.order("Tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        tea.setTeaType(Tea.TeaType.OOLONG);

        Coffee coffee = (Coffee)drinkShop.order("coffee", Drink.SugarType.QUARTER,Drink.IceType.HOT);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);
    }
}
