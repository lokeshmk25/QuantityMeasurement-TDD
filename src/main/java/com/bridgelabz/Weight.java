package com.bridgelabz;

public enum Weight implements MeasurementUnits {
    GRAM(0.001),KILOGRAM(1.0),TONNE(0.0);

    private double convertionvalue;

    Weight(double convertionvalue) {
        this.convertionvalue = convertionvalue;
    }

    @Override
    public double convertToBaseUnit(double value) {
      return value*convertionvalue;
    }
}
