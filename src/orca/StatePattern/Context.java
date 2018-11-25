package orca.StatePattern;


public class Context {

    State state;

    public Context ( State state ){
        this.state = state;
    }

    public String getDesc(){

        return state.getDesc();
    }

    public void handle(Context this){
        state.handle(this);
    }

    public int getColor(){
        return state.getColor();
    }


}
