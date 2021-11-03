package com.bridgelabz;

public enum Volume implements MeasurementUnits{
    LITRES(1.0),GALLON(3.78),MILLILITRES(1000);

    private double convertionvalue;

    Volume(double convertionvalue) {
        this.convertionvalue = convertionvalue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*convertionvalue;
    }
}
