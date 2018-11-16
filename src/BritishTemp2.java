public class BritishTemp2 extends British implements ITransformSystem {


    @Override
    public double britishToMetric(double british) {
        return 0;
    }

    @Override
    public double metricToBritish(double metric) {
        return 0;
    }

    @Override
    public double displayNumber(Double number) {
        return super.displayNumber(number);
    }

    @Override
    public double saveNumber(Double number) {
        return super.saveNumber(number);
    }

    @Override
    public void setUnit(EUnitType unitType) {
        super.setUnit(EUnitType.TEMPERTURE);
    }
}
