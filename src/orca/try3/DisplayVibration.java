package orca.try3;

public class DisplayVibration implements IDisplayValue {

    @Override
    public String displayMetric(ISaveValue saveValue) {
        return String.format("%0.2f",saveValue.getSavedValue());
    }

    @Override
    public String displayBritish(ISaveValue saveValue) {
        return String.format("%0.2f",metricToBritish(saveValue.getSavedValue()));

    }

    private double metricToBritish(double metric){
//        TODO transformValue
        double british = metric;
        return british;
    }

}
