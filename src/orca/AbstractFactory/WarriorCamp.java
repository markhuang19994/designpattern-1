package orca.AbstractFactory;

public class WarriorCamp implements TrainingCamp {
    @Override
    public Adventure trainAdventure() {
        System.out.println("訓練一個鬥士");
        return new Warrior();
    }
}
