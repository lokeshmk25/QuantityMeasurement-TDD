package com.bridgelabz;

public enum Length implements MeasurementUnits{
    INCH(1.0),FEET(12),YARD(36),CENTIMETER(0.4);

    private final double convertionValue;

    Length(double convertionValue) {
        this.convertionValue=convertionValue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*convertionValue;
    }
}
