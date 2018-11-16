package orca.Command;

public class TurnOn extends  Command {
    public TurnOn(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
