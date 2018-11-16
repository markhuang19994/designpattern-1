package orca.DiscountShop;

import java.util.ArrayList;
import java.util.List;

public class DrinkOrder {

    private List<Drink> drinkList = new ArrayList<Drink>();

    public void addDrink(Drink drink){
        drinkList.add(drink);
    }

    public void removeDrink(Drink drink){
        drinkList.remove(drink);
    }

    private double totalPrice(){

        double totalPrice = 0 ;

        for(Drink d:drinkList){
            totalPrice += d.getValue();
        }

        return totalPrice;

    }

    public double getTotalPrice(IDiscountStrategy discountStrategy){

        double totalPrice = totalPrice() ;

        return discountStrategy.getValue(totalPrice);

    }

}
