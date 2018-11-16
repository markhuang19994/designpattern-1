package orca.RestaurantSecond;

public class Drink extends Item {

    private void addDrink(){
        System.out.println("一份飲料");
    }

    @Override
    public void show() {
        super.show();
        addDrink();
    }
}
