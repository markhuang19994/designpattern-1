package orca.StrategySecond;

public class PriceCalculator {
    IStrategy strategy;

    private PriceCalculator(){};

    public PriceCalculator(IStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int km){
        return this.calculate(km,strategy);
    }

    public int calculate(int km , IStrategy strategy){
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}
