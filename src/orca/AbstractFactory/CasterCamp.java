package orca.AbstractFactory;

public class CasterCamp implements TrainingCamp {
    @Override
    public Adventure trainAdventure() {
        System.out.println("訓練一個法師！");
        return new Caster();
    }
}
