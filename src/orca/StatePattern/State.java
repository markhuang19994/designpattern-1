package orca.StatePattern;

abstract public class State {


    private String desc;
    private int color;

    public State(){}


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    abstract public void handle(Context context);

}
