package orca.Facade;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        Facade facade = new Facade();

        System.out.println("MethodA : ");
        facade.MethodA();

        System.out.println("MethodB : ");
        facade.MethodB();

    }
}
