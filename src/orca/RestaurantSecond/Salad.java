package orca.RestaurantSecond;

public class Salad extends Item {

    private void addSalad(){
        System.out.println("一份沙拉");
    }

    @Override
    public void show() {
        super.show();
        addSalad();
    }
}
