public class British implements IMetricSystem,IUnit {

    EUnitType unitType ;

    @Override
    public double displayNumber(Double number) {
        return 0;
    }

    @Override
    public double saveNumber(Double number) {
        return 0;
    }

    @Override
    public void setUnit(EUnitType unitType) {
        this.unitType = unitType;
    }
}

