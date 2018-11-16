package orca.Barbecue;

public class Yakiniku implements Order {

    Chef chef;

    Yakiniku(Chef chef){
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cook();
        System.out.println("做日式燒肉");
    }

    @Override
    public void unexecute() {
        chef.cook();
        System.out.println("取消日式燒肉了");
    }
}
