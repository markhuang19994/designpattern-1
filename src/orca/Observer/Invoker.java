package orca.Observer;

public class Invoker {
    public static void main(String... args){

        Secretary secretary = new Secretary();
        Boss boss = new Boss();

        NBAObserver nbaObserver = new NBAObserver("Nick",secretary);
        StockObserver stockObserver = new StockObserver("Jack",boss);

        secretary.attach(nbaObserver);
        secretary.attach(stockObserver);


        secretary.notifyObserver("老闆來了ㄚ");



        System.out.println("run");

    }
}
