package com.bridgelabz;

public enum Weight implements MeasurementUnits {
    KILOGRAM(1.0),GRAM(0.001),TONNE(1000.0);

    private double convertionvalue;

    Weight(double convertionvalue) {
        this.convertionvalue = convertionvalue;
    }

    @Override
    public double convertToBaseUnit(double value) {
      return value*convertionvalue;
    }
}
