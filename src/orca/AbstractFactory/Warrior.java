package orca.AbstractFactory;

public class Warrior implements Adventure {
    @Override
    public void attack() {
        System.out.println("用斧頭砍！");
    }
}
