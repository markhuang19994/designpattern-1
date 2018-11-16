public class BritishTemp implements IMetricSystem {



    @Override
    public double displayNumber(Double number) {
        System.out.println("British number");
        return metricToBritish(number);
    }

    @Override
    public double saveNumber(Double number) {
        System.out.println(" save British number");
        return britishToMetric(number);
    }

    private double britishToMetric(Double british){
        double metric = (british - 32)* 5 / 9 ;
        return metric;
    }

    private double metricToBritish(double metric){
        double british = metric * 9 / 5 + 32;
        return british;
    }

}
