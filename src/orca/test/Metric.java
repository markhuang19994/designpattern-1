package orca.test;

public class Metric implements IMetricSystem {

    @Override
    public double calcTemp(double metric) {
        return metric;
    }

    @Override
    public double calcLength(double metric) {
        return metric;
    }

    @Override
    public MetricSystem getMetricSystem() {
        return MetricSystem.METRIC;
    }
}
