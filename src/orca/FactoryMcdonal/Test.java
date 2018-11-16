package orca.FactoryMcdonal;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        /*
        Factory colaFactory = new ColaFactory();
        Product productA = colaFactory.getProduct();

        productA.describe();


        Factory iceCream = new IceCreamFactory();
        Product productB = iceCream.getProduct();
        */

        Factory friesFac = new FrenchFriesFactory();
        Product fries = friesFac.getProduct();
        Product myfries = ((FrenchFriesFactory) friesFac).getProduct("無鹽的");

        fries.describe();
        myfries.describe();

    }
}
