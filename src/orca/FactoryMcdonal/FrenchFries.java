package orca.FactoryMcdonal;

public class FrenchFries implements Product{

    String state = "有鹽巴";

    protected FrenchFries(){}

    protected FrenchFries(String state){
        this.state = state;
    }

    @Override
    public void describe() {
        System.out.println("我是"+ state +"薯條");
    }
}
