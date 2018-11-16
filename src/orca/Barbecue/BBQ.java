package orca.Barbecue;

public class BBQ implements Order {

    Chef chef;

    BBQ(Chef chef){
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cook();
        System.out.println("做美式BBQ");
    }

    @Override
    public void unexecute() {
        chef.cook();
        System.out.println("取消美式BBQ");
    }
}
