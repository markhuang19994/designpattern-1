package orca.DrinkShop;

public class Tea extends Drink {

    private TeaType teaType;

    public Tea(SugarType sugar, IceType ice) {
        super(sugar, ice);
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    enum TeaType{
        LEMON,OOLONG,GINGER,HONEY
    }

}
