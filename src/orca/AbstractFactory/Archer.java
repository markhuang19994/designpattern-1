package orca.AbstractFactory;

public class Archer implements Adventure {
    @Override
    public void attack() {
        System.out.println("用弓射箭！");
    }
}
