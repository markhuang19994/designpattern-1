package orca.BuilderMode;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test(){
        System.out.println("this is client testing");

        ConcreteBuilder1 b1 = new ConcreteBuilder1();
        Director director = new Director(b1);
        director.constructor();
        String result = b1.getResult();
        System.out.println(result);

    }
}
