package com.bridgelabz;

public enum Temperature implements MeasurementUnits{
    FARENHEIT(0.0),CELCIUS(0.0);

    private double convertionvalue;

    Temperature(double convertionvalue) {
        this.convertionvalue = convertionvalue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*convertionvalue;
    }
}
