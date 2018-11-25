package orca.StatePattern;

public class StateOff extends State {

    public StateOff() {
        super();
        setColor(2);
        setDesc("Off");
    }

    @Override
    public void handle(Context context) {
        System.out.println("關閉");
        context.state = new StateOn();
    }
}
