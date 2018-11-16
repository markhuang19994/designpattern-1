package orca.test;

public interface IDataPlay extends IMetricSystem {



    double saveTemp(double temp);

    double saveLength(double length);

    @Override
    double calcTemp(double metric);

    @Override
    double calcLength(double metric);
}
