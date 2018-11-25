package orca.StatePattern;

public class StateOn extends State {

    public StateOn() {
        super();
        setDesc("On");
        setColor(1);
    }


    @Override
    public void handle(Context context) {
        System.out.println("打開");
        context.state = new StateOff();
    }
}
