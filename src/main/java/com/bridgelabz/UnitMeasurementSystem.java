package com.bridgelabz;

public class UnitMeasurementSystem {
    private final double value;
    private final MeasurementUnits unit;

    /**
     * @param value
     */
    public UnitMeasurementSystem(MeasurementUnits unit,double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(UnitMeasurementSystem thatUnit) {
        if (this.unit.getClass()!= thatUnit.unit.getClass())
            return false;
        if (this.unit.equals(thatUnit.unit))
            return this.equals(thatUnit);
            return Double.compare(this.unit.convertToBaseUnit(this.value),thatUnit.unit.convertToBaseUnit(thatUnit.value)) == 0;
    }

    public UnitMeasurementSystem addition(UnitMeasurementSystem thatUnit, MeasurementUnits requiredUnit){
        double sum = this.unit.convertToBaseUnit(this.value) + thatUnit.unit.convertToBaseUnit(thatUnit.value);
        return new UnitMeasurementSystem(requiredUnit,sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnitMeasurementSystem)) return false;
        UnitMeasurementSystem quantity = (UnitMeasurementSystem) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }
}







