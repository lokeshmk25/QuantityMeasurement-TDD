package com.bridgelabz;

public enum Temperature implements MeasurementUnits{
    FARENHEIT(1.0),CELCIUS(2.12);

    private double convertionvalue;

    Temperature(double convertionvalue) {
        this.convertionvalue = convertionvalue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*convertionvalue;
    }
}
