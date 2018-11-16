package orca.AbstractFactory;

public class Caster implements Adventure {
    @Override
    public void attack() {
        System.out.println("發射魔法！");
    }
}
