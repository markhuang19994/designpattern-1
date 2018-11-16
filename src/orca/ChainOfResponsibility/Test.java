package orca.ChainOfResponsibility;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        Handler manager = new Manager();

//        小問題
        Trouble smallTrouble = new Trouble("想加薪500", 500);

        manager.handleRequest(smallTrouble);

//        大問題
        Trouble bigTrouble = new Trouble("搞壞五十萬的機器",500000);

        manager.handleRequest(bigTrouble);


    }
}
