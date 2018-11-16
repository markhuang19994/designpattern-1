package orca.test;

public class British implements IMetricSystem,IToMetric {

    @Override
    public double calcTemp(double metric) {
        return 0;
    }

    @Override
    public double calcLength(double metric) {
        return 0;
    }

    @Override
    public MetricSystem getMetricSystem() {
        return MetricSystem.BRITISH;
    }

    @Override
    public double toMetricTemp(double notMetricTemp) {
        return 0;
    }

    @Override
    public double toMetricLength(double notMetricLength) {
        return 0;
    }
}
