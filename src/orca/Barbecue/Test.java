package orca.Barbecue;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        Chef john = new Chef();

        Clerk clerk = new Clerk();


        BBQ BBQ1 = new BBQ(john);

        clerk.addOrder(BBQ1);
        clerk.addOrder(BBQ1);
        clerk.addOrder(new Yakiniku(john));

        clerk.removeOrder(BBQ1);

        clerk.invoke();

    }
}
