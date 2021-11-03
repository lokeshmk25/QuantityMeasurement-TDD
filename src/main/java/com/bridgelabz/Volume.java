package com.bridgelabz;

public enum Volume implements MeasurementUnits{
    GALLON(1.0),LITRES(0.26),MILLILITRES(0.00026);

    private double convertionvalue;

    Volume(double convertionvalue) {
        this.convertionvalue = convertionvalue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*convertionvalue;
    }
}
