package orca.AbstractFactory;

public class ArcherCamp implements TrainingCamp {
    @Override
    public Adventure trainAdventure() {
        System.out.println("訓練一個弓箭手");
        return new Archer();
    }
}
