package orca.StatePattern;


public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        Context context = new Context(new StateOn());

        context.handle();
        context.handle();
        context.handle();
        context.handle();

    }
}
