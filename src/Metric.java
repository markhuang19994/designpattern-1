public class Metric implements IMetricSystem {


    @Override
    public double displayNumber(Double number) {
        System.out.println("Metric number");
        return number;
    }

    @Override
    public double saveNumber(Double number) {
        System.out.println("save Metric number");
        return number;
    }
}
