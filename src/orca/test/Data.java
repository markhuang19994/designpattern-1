package orca.test;

public class Data implements IDataPlay {


    IMetricSystem metricSystem;

    Data(IMetricSystem metricSystem){
        this.metricSystem = metricSystem;
    }

    public void setMetricSystem(IMetricSystem metricSystem) {
        this.metricSystem = metricSystem;
    }

    @Override
    public double saveTemp(double temp) {

        switch (metricSystem.getMetricSystem()) {
            case METRIC:

                return metricSystem.calcTemp(temp);


            case BRITISH:

                return ((British)metricSystem).toMetricTemp(temp);


        }

        return 0;
    }

    @Override
    public double saveLength(double length) {
        switch (metricSystem.getMetricSystem()){
            case METRIC:
                return metricSystem.calcLength(length);

            case BRITISH:

                return ((British)metricSystem).toMetricLength(length);
        }
        return length;
    }

    @Override
    public double calcTemp(double metric) {
        return metricSystem.calcTemp(metric);
    }

    @Override
    public double calcLength(double metric) {
        return metricSystem.calcLength(metric);
    }

    @Override
    public MetricSystem getMetricSystem() {
        return metricSystem.getMetricSystem();
    }
}
