public class BritishLength implements IMetricSystem {

    @Override
    public double displayNumber(Double number) {
        System.out.println("BritishLength number");
        return metricToBritish(number);
    }

    @Override
    public double saveNumber(Double number) {
        System.out.println(" save BritishLength number");
        return britishToMetric(number);
    }

    private double britishToMetric(Double british){
        double metric = british * 25.4 ;
        return metric;
    }

    private double metricToBritish(double metric){
        double british = metric / 25.4 ;
        return british;
    }
}
