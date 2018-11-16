package orca.Visitor;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        Temperture temperture = new Temperture();

        AirQuality airQuality = new AirQuality();

        Visit man = new Man();
        Visit woman = new Woman();

        System.out.println("----- 男生 -----");
        man.visit(temperture);
        man.visit(airQuality);

        System.out.println("----- 女生 -----");
        woman.visit(temperture);
        woman.visit(airQuality);
    }
}
