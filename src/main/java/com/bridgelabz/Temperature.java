package com.bridgelabz;

import java.util.function.Function;

public enum Temperature implements MeasurementUnits{
    FARENHEIT(true),CELCIUS(false);

    final Function<Double,Double> degFtoCelcius = (Double degF) -> (degF.doubleValue()-32)*5/9;
    final Function<Double,Double> degCtoCelcius = (Double degC) -> degC.doubleValue();

    final Function<Double,Double> convertionvalue;

    Temperature(boolean isFarenheit) {
        if(isFarenheit)this.convertionvalue = degFtoCelcius;
        else this.convertionvalue=degCtoCelcius;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return convertionvalue.apply(value);
    }
}
