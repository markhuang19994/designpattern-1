public class MetricMaker implements IMetricSystem {



    static IMetricSystem metric = new Metric();
    static IMetricSystem british = new British();
    static IMetricSystem britishTemp = new BritishLength();
    static IMetricSystem britishLength = new BritishLength();

    static IMetricSystem metricSystem = metric;

    final static int METRIC = 1;
    final static int BRITISH = 2;


    static int state = METRIC;

    static EUnitType unitType;

    @Override
    public double displayNumber(Double number) {
        return metricSystem.displayNumber(number);
    }

    @Override
    public double saveNumber(Double number) {
        return metricSystem.saveNumber(number);
    }


    public void setSystem(int state){

        switch (state){
            case 1:
                state = METRIC;
                metricSystem = metric;
                break;
            case 2:
                state = BRITISH;
                metricSystem = british;
                break;
            default:
                break;
        }
    }

}
